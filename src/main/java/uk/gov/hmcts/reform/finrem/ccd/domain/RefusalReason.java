package uk.gov.hmcts.reform.finrem.ccd.domain;

import com.fasterxml.jackson.databind.PropertyNamingStrategy;
import com.fasterxml.jackson.databind.annotation.JsonNaming;

@JsonNaming(PropertyNamingStrategy.SnakeCaseStrategy.class)
public enum RefusalReason {
    FR_MS_REFUSAL_REASON_1,
    FR_MS_REFUSAL_REASON_2,
    FR_MS_REFUSAL_REASON_3,
    FR_MS_REFUSAL_REASON_4,
    FR_MS_REFUSAL_REASON_5,
    FR_MS_REFUSAL_REASON_6,
    FR_MS_REFUSAL_REASON_7,
    FR_MS_REFUSAL_REASON_8,
    FR_MS_REFUSAL_REASON_9,
    FR_MS_REFUSAL_REASON_10,
    FR_MS_REFUSAL_REASON_11,
    FR_MS_REFUSAL_REASON_12,
    FR_MS_REFUSAL_REASON_13,
    FR_MS_REFUSAL_REASON_14
}
