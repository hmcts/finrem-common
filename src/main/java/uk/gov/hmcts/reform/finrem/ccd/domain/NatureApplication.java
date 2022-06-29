package uk.gov.hmcts.reform.finrem.ccd.domain;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.databind.PropertyNamingStrategy;
import com.fasterxml.jackson.databind.annotation.JsonNaming;
import lombok.RequiredArgsConstructor;

import java.util.Arrays;

@JsonNaming(PropertyNamingStrategy.SnakeCaseStrategy.class)
@RequiredArgsConstructor
public enum NatureApplication {
    PERIODICAL_PAYMENT_ORDER("periodicalPaymentOrder"),
    MAINTENANCE_PENDING_SUIT("Maintenance Pending Suit"),
    LUMP_SUM_ORDER("Lump Sum Order"),
    PENSION_SHARING_ORDER("Pension Sharing Order"),
    PENSION_ATTACHMENT_ORDER("Pension Attachment Order"),
    PENSION_COMPENSATION_SHARING_ORDER("Pension Compensation Sharing Order"),
    PENSION_COMPENSATION_ATTACHMENT_ORDER("Pension Compensation Attachment Order"),
    A_SETTLEMENT_OR_A_TRANSFER_OF_PROPERTY("A settlement or a transfer of property"),
    PROPERTY_ADJUSTMENT_ORDER("propertyAdjustmentOrder");

    private final String value;

    @JsonValue
    public String getValue() {
        return value;
    }

    @JsonCreator
    public static NatureApplication forValue(String value) {
        return Arrays.stream(NatureApplication.values())
            .filter(option -> value.equalsIgnoreCase(option.getValue()))
            .findFirst().orElseThrow(IllegalArgumentException::new);
    }
}
