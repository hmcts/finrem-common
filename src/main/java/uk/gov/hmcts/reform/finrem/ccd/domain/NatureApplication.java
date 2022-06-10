package uk.gov.hmcts.reform.finrem.ccd.domain;

import com.fasterxml.jackson.databind.PropertyNamingStrategy;
import com.fasterxml.jackson.databind.annotation.JsonNaming;

@JsonNaming(PropertyNamingStrategy.SnakeCaseStrategy.class)
public enum NatureApplication {

    PERIODICAL_PAYMENT_ORDER,
    MAINTENANCE_PENDING_SUIT,
    LUMP_SUM_ORDER,
    PENSION_SHARING_ORDER,
    PENSION_ATTACHMENT_ORDER,
    PENSION_COMPENSATION_SHARING_ORDER,
    PENSION_COMPENSATION_ATTACHMENT_ORDER,
    A_SETTLEMENT_OR_A_TRANSFER_OF_PROPERTY,
    PROPERTY_ADJUSTMENT_ORDER
}
