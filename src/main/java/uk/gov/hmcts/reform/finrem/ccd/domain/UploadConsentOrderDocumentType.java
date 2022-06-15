package uk.gov.hmcts.reform.finrem.ccd.domain;

import com.fasterxml.jackson.databind.PropertyNamingStrategy;
import com.fasterxml.jackson.databind.annotation.JsonNaming;

@JsonNaming(PropertyNamingStrategy.SnakeCaseStrategy.class)
public enum UploadConsentOrderDocumentType {
    CONSENT_ORDER, COVER_ORDER, P1, P2, PPF, PPF1, PPF2, OTHER
}
