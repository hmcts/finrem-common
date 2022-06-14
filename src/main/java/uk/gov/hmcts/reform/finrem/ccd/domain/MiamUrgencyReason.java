package uk.gov.hmcts.reform.finrem.ccd.domain;

import com.fasterxml.jackson.databind.PropertyNamingStrategy;
import com.fasterxml.jackson.databind.annotation.JsonNaming;

@JsonNaming(PropertyNamingStrategy.SnakeCaseStrategy.class)
public enum MiamUrgencyReason {
    FR_MS_MIAM_URGENCY_REASON_CHECKLIST_VALUE_1,
    FR_MS_MIAM_URGENCY_REASON_CHECKLIST_VALUE_2,
    FR_MS_MIAM_URGENCY_REASON_CHECKLIST_VALUE_3,
    FR_MS_MIAM_URGENCY_REASON_CHECKLIST_VALUE_4,
    FR_MS_MIAM_URGENCY_REASON_CHECKLIST_VALUE_5
}
