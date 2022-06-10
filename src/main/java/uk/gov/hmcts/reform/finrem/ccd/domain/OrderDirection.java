package uk.gov.hmcts.reform.finrem.ccd.domain;

import com.fasterxml.jackson.databind.PropertyNamingStrategy;
import com.fasterxml.jackson.databind.annotation.JsonNaming;

@JsonNaming(PropertyNamingStrategy.SnakeCaseStrategy.class)
public enum OrderDirection {
    ORDER_ACCEPTED_AS_DRAFTED,
    ORDER_ACCEPTED_AS_AMENDED,
    ORDER_ACCEPTED_WITH_CONDITIONS,
    DISTRICT_JUDGE,
    DEPUTY_DISTRICT_JUDGE,
    HIS_HONOUR_JUDGE,
    HER_HONOUR_JUDGE,
    RECORDER
}
