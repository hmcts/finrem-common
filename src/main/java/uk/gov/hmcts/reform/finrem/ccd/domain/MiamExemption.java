package uk.gov.hmcts.reform.finrem.ccd.domain;

import com.fasterxml.jackson.databind.PropertyNamingStrategy;
import com.fasterxml.jackson.databind.annotation.JsonNaming;

@JsonNaming(PropertyNamingStrategy.SnakeCaseStrategy.class)
public enum MiamExemption {
    DOMESTIC_VIOLENCE,
    URGENCY,
    PREVIOUS_MIAM_ATTENDANCE,
    OTHER
}
