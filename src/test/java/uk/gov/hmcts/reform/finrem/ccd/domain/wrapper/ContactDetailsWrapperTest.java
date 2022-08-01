package uk.gov.hmcts.reform.finrem.ccd.domain.wrapper;


import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.datatype.jsr310.JavaTimeModule;
import org.junit.Before;
import org.junit.Test;
import uk.gov.hmcts.reform.finrem.ccd.callback.CallbackRequest;
import uk.gov.hmcts.reform.finrem.ccd.domain.Address;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

public class ContactDetailsWrapperTest {

    public static final String TEST_RESOURCE = "src/test/resources/fixtures/case-details.json";

    private ObjectMapper objectMapper =  new ObjectMapper().registerModule(new JavaTimeModule());

    @Before
    public void setUp() {
    }

    @Test
    public void testFakeAddress() throws IOException {
        CallbackRequest callbackRequest = objectMapper.readValue(getResource(), CallbackRequest.class);
        ContactDetailsWrapper contactDetailsWrapper = callbackRequest.getCaseDetails().getCaseData().getContactDetailsWrapper();

        Address fakeAddress = contactDetailsWrapper.getFakeAddress();
        assertNotNull(fakeAddress);
        assertEquals("CR5 2JX", fakeAddress.getPostCode());
        Address respSolAddress = contactDetailsWrapper.getRespondentSolicitorAddress();
        assertNotNull(respSolAddress);
        Address solAddress = contactDetailsWrapper.getSolicitorAddress();
        assertNotNull(solAddress);
        Address appSolAddress = contactDetailsWrapper.getApplicantSolicitorAddress();
        assertNotNull(contactDetailsWrapper.getApplicantSolicitorName());
        assertNotNull(contactDetailsWrapper.getApplicantSolicitorEmail());
        assertNotNull(contactDetailsWrapper.getApplicantSolicitorFirm());
        assertNotNull(contactDetailsWrapper.getApplicantAddressHiddenFromRespondent());
        assertNotNull(contactDetailsWrapper.getRespondentAddressHiddenFromApplicant());
        assertNotNull(appSolAddress);

        assertNotNull(contactDetailsWrapper.getUpdateIncludesRepresentativeChange());
        assertNotNull(contactDetailsWrapper.getRespondentSolicitorEmail());
        assertNotNull(contactDetailsWrapper.getRespondentSolicitorFirm());
        assertNotNull(contactDetailsWrapper.getRespondentSolicitorName());
        assertNotNull(contactDetailsWrapper.getApplicantAddress());
    }

    private String getResource() throws IOException {
        Path path = Paths.get(TEST_RESOURCE);
        return new String(Files.readAllBytes(path));
    }
}