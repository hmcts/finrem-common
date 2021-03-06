package uk.gov.hmcts.reform.finrem.ccd.domain.wrapper;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import uk.gov.hmcts.reform.finrem.ccd.domain.Address;
import uk.gov.hmcts.reform.finrem.ccd.domain.ConsentNatureOfApplication;
import uk.gov.hmcts.reform.finrem.ccd.domain.ConsentOrderCollection;
import uk.gov.hmcts.reform.finrem.ccd.domain.Document;
import uk.gov.hmcts.reform.finrem.ccd.domain.DraftDirectionDetailsCollection;
import uk.gov.hmcts.reform.finrem.ccd.domain.DraftDirectionOrder;
import uk.gov.hmcts.reform.finrem.ccd.domain.DraftDirectionOrderCollection;
import uk.gov.hmcts.reform.finrem.ccd.domain.NatureApplication;
import uk.gov.hmcts.reform.finrem.ccd.domain.OtherDocumentCollection;
import uk.gov.hmcts.reform.finrem.ccd.domain.PensionProvider;
import uk.gov.hmcts.reform.finrem.ccd.domain.UploadConsentOrderCollection;
import uk.gov.hmcts.reform.finrem.ccd.domain.YesOrNo;

import java.time.LocalDate;
import java.util.List;

@JsonIgnoreProperties(ignoreUnknown = true)
@Data
@Builder(toBuilder = true)
@AllArgsConstructor
@NoArgsConstructor
@JsonInclude(JsonInclude.Include.NON_NULL)
public class ConsentOrderWrapper {
    private List<DraftDirectionOrderCollection> draftDirectionOrderCollection;
    private DraftDirectionOrder latestDraftDirectionOrder;
    private List<DraftDirectionOrderCollection> judgesAmendedOrderCollection;
    private List<DraftDirectionDetailsCollection> draftDirectionDetailsCollection;
    private List<DraftDirectionDetailsCollection> draftDirectionDetailsCollectionRO;
    private List<NatureApplication> consentNatureOfApplicationChecklist;
    private String consentNatureOfApplicationAddress;
    private String consentNatureOfApplicationMortgage;
    private YesOrNo consentOrderForChildrenQuestion1;
    private YesOrNo consentNatureOfApplication5;
    private List<ConsentNatureOfApplication> consentNatureOfApplication6;
    private String consentNatureOfApplication7;
    private YesOrNo consentD81Question;
    private Document consentD81Joint;
    private Document consentD81Applicant;
    private Document consentD81Respondent;
    private List<OtherDocumentCollection> consentOtherCollection;
    private String consentOrderFrcName;
    private Address consentOrderFrcAddress;
    private String consentOrderFrcEmail;
    private String consentOrderFrcPhone;
    private YesOrNo consentSubjectToDecreeAbsoluteValue;
    private YesOrNo consentServePensionProvider;
    private PensionProvider consentServePensionProviderResponsibility;
    private String consentServePensionProviderOther;
    private String consentSelectJudge;
    private String consentJudgeName;
    private List<ConsentOrderCollection> consentedNotApprovedOrders;
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd")
    private LocalDate consentDateOfOrder;
    private String consentAdditionalComments;
    private Document consentMiniFormA;
    private Document uploadConsentedOrder;
    private List<ConsentOrderCollection> contestedConsentedApprovedOrders;
    private List<UploadConsentOrderCollection> uploadConsentOrder;
}
