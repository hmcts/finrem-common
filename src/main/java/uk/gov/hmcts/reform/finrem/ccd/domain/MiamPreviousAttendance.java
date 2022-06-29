package uk.gov.hmcts.reform.finrem.ccd.domain;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.databind.PropertyNamingStrategy;
import com.fasterxml.jackson.databind.annotation.JsonNaming;
import lombok.RequiredArgsConstructor;

import java.util.Arrays;

@JsonNaming(PropertyNamingStrategy.SnakeCaseStrategy.class)
@RequiredArgsConstructor
public enum MiamPreviousAttendance {
    FR_MS_MIAM_PREVIOUS_ATTENDANCE_CHECKLIST_VALUE_1("FR_ms_MIAMPreviousAttendanceChecklist_Value_1"),
    FR_MS_MIAM_PREVIOUS_ATTENDANCE_CHECKLIST_VALUE_2("FR_ms_MIAMPreviousAttendanceChecklist_Value_2"),
    FR_MS_MIAM_PREVIOUS_ATTENDANCE_CHECKLIST_VALUE_3("FR_ms_MIAMPreviousAttendanceChecklist_Value_3"),
    FR_MS_MIAM_PREVIOUS_ATTENDANCE_CHECKLIST_VALUE_4("FR_ms_MIAMPreviousAttendanceChecklist_Value_4"),
    FR_MS_MIAM_PREVIOUS_ATTENDANCE_CHECKLIST_VALUE_5("FR_ms_MIAMPreviousAttendanceChecklist_Value_5");

    private final String value;

    @JsonValue
    public String getValue() {
        return value;
    }

    @JsonCreator
    public static MiamPreviousAttendance forValue(String value) {
        return Arrays.stream(MiamPreviousAttendance.values())
            .filter(option -> value.equalsIgnoreCase(option.getValue()))
            .findFirst().orElseThrow(IllegalArgumentException::new);
    }
}
