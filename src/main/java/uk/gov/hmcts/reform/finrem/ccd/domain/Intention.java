package uk.gov.hmcts.reform.finrem.ccd.domain;

import com.fasterxml.jackson.databind.PropertyNamingStrategy;
import com.fasterxml.jackson.databind.annotation.JsonNaming;
import lombok.RequiredArgsConstructor;

@JsonNaming(PropertyNamingStrategy.SnakeCaseStrategy.class)
@RequiredArgsConstructor
public enum Intention {

    APPLY_TO_COURT_FOR,
    PROCEED_WITH_APPLICATION,
    APPLY_TO_VARY,
    APPLY_TO_DISCHARGE_PERIODICAL_PAYMENT_ORDER
}

