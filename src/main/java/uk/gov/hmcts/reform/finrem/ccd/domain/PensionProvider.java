package uk.gov.hmcts.reform.finrem.ccd.domain;

import com.fasterxml.jackson.databind.PropertyNamingStrategy;
import com.fasterxml.jackson.databind.annotation.JsonNaming;

@JsonNaming(PropertyNamingStrategy.SnakeCaseStrategy.class)
public enum PensionProvider {
    THE_COURT,
    APPLICANT_SOLICITOR,
    RESPONDENT_SOLICITOR,
    OTHER
}
