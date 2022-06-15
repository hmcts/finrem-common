package uk.gov.hmcts.reform.finrem.ccd.domain;

import com.fasterxml.jackson.databind.PropertyNamingStrategy;
import com.fasterxml.jackson.databind.annotation.JsonNaming;

@JsonNaming(PropertyNamingStrategy.SnakeCaseStrategy.class)
public enum PeriodicalPaymentSubstitute {
    LUMP_SUM_ORDER,
    PROPERTY_ADJUSTMENT_ORDER,
    PENSION_SHARING_ORDER,
    PENSION_COMPENSATION_SHARING_ORDER
}
