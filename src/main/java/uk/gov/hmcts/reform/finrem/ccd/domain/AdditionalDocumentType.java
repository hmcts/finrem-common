package uk.gov.hmcts.reform.finrem.ccd.domain;

import com.fasterxml.jackson.databind.PropertyNamingStrategy;
import com.fasterxml.jackson.databind.annotation.JsonNaming;

@JsonNaming(PropertyNamingStrategy.SnakeCaseStrategy.class)
public enum AdditionalDocumentType {
    STATEMENT_IN_SUPPORT_INCLUDING_MPS,
    SCHEDULE_OF_ASSETS,
    LETTER,
    NOTICE_OF_ACTING,
    ALLOCATION_QUESTIONNAIRE,
    OTHER
}
