package uk.gov.hmcts.reform.finrem.ccd.domain;

import com.fasterxml.jackson.databind.PropertyNamingStrategy;
import com.fasterxml.jackson.databind.annotation.JsonNaming;

@JsonNaming(PropertyNamingStrategy.SnakeCaseStrategy.class)
public enum RespondToOrderDocumentType {
    APPLICANT_LETTER_EMAIL,
    RESPONDENT_LETTER_EMAIL,
    AMENDED_CONSENT_ORDER,
    STATEMENT_REPORT,
    OTHER
}
