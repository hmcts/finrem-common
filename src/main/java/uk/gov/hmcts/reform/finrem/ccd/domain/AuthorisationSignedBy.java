package uk.gov.hmcts.reform.finrem.ccd.domain;

import java.util.Arrays;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.databind.PropertyNamingStrategy;
import com.fasterxml.jackson.databind.annotation.JsonNaming;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public enum AuthorisationSignedBy {
    APPLICANT("Applicant"),
    LITIGATION_FRIEND("Litigation Friend"),
    APPLICANT_SOLICITOR("Applicant's solicitor");

    private final String id;

    @JsonValue
    public String getId() {
        return id;
    }

    @JsonCreator
    public static AuthorisationSignedBy getAuthorisationSignedBy(String ccdType) {
        return Arrays.stream(AuthorisationSignedBy.values())
            .filter(option -> option.id.equals(ccdType))
            .findFirst().orElseThrow(IllegalArgumentException::new);
    }
}
