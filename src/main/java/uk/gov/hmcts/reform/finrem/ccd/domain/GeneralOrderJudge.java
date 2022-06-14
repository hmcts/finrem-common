package uk.gov.hmcts.reform.finrem.ccd.domain;

import com.fasterxml.jackson.databind.PropertyNamingStrategy;
import com.fasterxml.jackson.databind.annotation.JsonNaming;

@JsonNaming(PropertyNamingStrategy.SnakeCaseStrategy.class)
public enum GeneralOrderJudge {
    DISTRICT_JUDGE,
    DEPUTY_DISTRICT_JUDGE,
    HIS_HONOUR_JUDGE,
    HER_HONOUR_JUDGE,
    RECORDER
}
