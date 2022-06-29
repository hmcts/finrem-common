package uk.gov.hmcts.reform.finrem.ccd.domain;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.databind.PropertyNamingStrategy;
import com.fasterxml.jackson.databind.annotation.JsonNaming;
import lombok.RequiredArgsConstructor;

import java.util.Arrays;

@JsonNaming(PropertyNamingStrategy.SnakeCaseStrategy.class)
@RequiredArgsConstructor
public enum MiamOtherGrounds {
    FR_MS_MIAM_OTHER_GROUNDS_CHECKLIST_VALUE_1("FR_ms_MIAMOtherGroundsChecklist_Value_1"),
    FR_MS_MIAM_OTHER_GROUNDS_CHECKLIST_VALUE_2("FR_ms_MIAMOtherGroundsChecklist_Value_2"),
    FR_MS_MIAM_OTHER_GROUNDS_CHECKLIST_VALUE_3("FR_ms_MIAMOtherGroundsChecklist_Value_3"),
    FR_MS_MIAM_OTHER_GROUNDS_CHECKLIST_VALUE_4("FR_ms_MIAMOtherGroundsChecklist_Value_4"),
    FR_MS_MIAM_OTHER_GROUNDS_CHECKLIST_VALUE_5("FR_ms_MIAMOtherGroundsChecklist_Value_5"),
    FR_MS_MIAM_OTHER_GROUNDS_CHECKLIST_VALUE_6("FR_ms_MIAMOtherGroundsChecklist_Value_6"),
    FR_MS_MIAM_OTHER_GROUNDS_CHECKLIST_VALUE_7("FR_ms_MIAMOtherGroundsChecklist_Value_7"),
    FR_MS_MIAM_OTHER_GROUNDS_CHECKLIST_VALUE_8("FR_ms_MIAMOtherGroundsChecklist_Value_8"),
    FR_MS_MIAM_OTHER_GROUNDS_CHECKLIST_VALUE_9("FR_ms_MIAMOtherGroundsChecklist_Value_9"),
    FR_MS_MIAM_OTHER_GROUNDS_CHECKLIST_VALUE_10("FR_ms_MIAMOtherGroundsChecklist_Value_10"),
    FR_MS_MIAM_OTHER_GROUNDS_CHECKLIST_VALUE_11("FR_ms_MIAMOtherGroundsChecklist_Value_11");

    private final String value;

    @JsonValue
    public String getValue() {
        return value;
    }

    @JsonCreator
    public static MiamOtherGrounds forValue(String value) {
        return Arrays.stream(MiamOtherGrounds.values())
            .filter(option -> value.equalsIgnoreCase(option.getValue()))
            .findFirst().orElseThrow(IllegalArgumentException::new);
    }
}
