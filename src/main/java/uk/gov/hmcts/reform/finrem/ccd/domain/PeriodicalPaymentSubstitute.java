package uk.gov.hmcts.reform.finrem.ccd.domain;

import com.fasterxml.jackson.annotation.JsonEnumDefaultValue;
import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.databind.PropertyNamingStrategy;
import com.fasterxml.jackson.databind.annotation.JsonNaming;
import lombok.RequiredArgsConstructor;

@JsonNaming(PropertyNamingStrategy.SnakeCaseStrategy.class)
public enum PeriodicalPaymentSubstitute {
    LUMP_SUM_ORDER,
    PROPERTY_ADJUSTMENT_ORDER,
    PENSION_SHARING_ORDER,
    PENSION_COMPENSATION_SHARING_ORDER
}
