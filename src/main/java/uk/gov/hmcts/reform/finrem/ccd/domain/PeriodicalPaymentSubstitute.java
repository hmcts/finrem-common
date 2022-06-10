package uk.gov.hmcts.reform.finrem.ccd.domain;

import com.fasterxml.jackson.annotation.JsonEnumDefaultValue;
import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.databind.PropertyNamingStrategy;
import com.fasterxml.jackson.databind.annotation.JsonNaming;
import lombok.RequiredArgsConstructor;

@JsonNaming(PropertyNamingStrategy.SnakeCaseStrategy.class)
@RequiredArgsConstructor
public enum PeriodicalPaymentSubstitute {
    LUMP_SUM_ORDER("lumpSumOrder"),
    PROPERTY_ADJUSTMENT_ORDER("propertyAdjustmentOrder"),
    PENSION_SHARING_ORDER("pensionSharingOrder"),
    PENSION_COMPENSATION_SHARING_ORDER("pensionCompensationSharingOrder"),

    @JsonEnumDefaultValue
    UNKNOWN("unknown");

    private final String id;

    @JsonValue
    public String getId() {
        return id;
    }
}
