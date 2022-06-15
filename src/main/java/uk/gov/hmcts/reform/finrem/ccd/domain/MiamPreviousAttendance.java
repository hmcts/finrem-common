package uk.gov.hmcts.reform.finrem.ccd.domain;

import com.fasterxml.jackson.databind.PropertyNamingStrategy;
import com.fasterxml.jackson.databind.annotation.JsonNaming;

@JsonNaming(PropertyNamingStrategy.SnakeCaseStrategy.class)
public enum MiamPreviousAttendance {
    FR_MS_MIAM_PREVIOUS_ATTENDANCE_CHECKLIST_VALUE_1,
    FR_MS_MIAM_PREVIOUS_ATTENDANCE_CHECKLIST_VALUE_2,
    FR_MS_MIAM_PREVIOUS_ATTENDANCE_CHECKLIST_VALUE_3,
    FR_MS_MIAM_PREVIOUS_ATTENDANCE_CHECKLIST_VALUE_4,
    FR_MS_MIAM_PREVIOUS_ATTENDANCE_CHECKLIST_VALUE_5
}
