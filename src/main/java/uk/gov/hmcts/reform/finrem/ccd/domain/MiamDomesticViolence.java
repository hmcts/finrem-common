package uk.gov.hmcts.reform.finrem.ccd.domain;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.databind.PropertyNamingStrategy;
import com.fasterxml.jackson.databind.annotation.JsonNaming;
import lombok.RequiredArgsConstructor;

import java.util.Arrays;

@JsonNaming(PropertyNamingStrategy.SnakeCaseStrategy.class)
@RequiredArgsConstructor
public enum MiamDomesticViolence {
    FR_MS_MIAM_DOMESTIC_VIOLENCE_CHECKLIST_VALUE_1("FR_ms_MIAMDomesticViolenceChecklist_Value_1"),
    FR_MS_MIAM_DOMESTIC_VIOLENCE_CHECKLIST_VALUE_2("FR_ms_MIAMDomesticViolenceChecklist_Value_2"),
    FR_MS_MIAM_DOMESTIC_VIOLENCE_CHECKLIST_VALUE_3("FR_ms_MIAMDomesticViolenceChecklist_Value_3"),
    FR_MS_MIAM_DOMESTIC_VIOLENCE_CHECKLIST_VALUE_4("FR_ms_MIAMDomesticViolenceChecklist_Value_4"),
    FR_MS_MIAM_DOMESTIC_VIOLENCE_CHECKLIST_VALUE_5("FR_ms_MIAMDomesticViolenceChecklist_Value_5"),
    FR_MS_MIAM_DOMESTIC_VIOLENCE_CHECKLIST_VALUE_6("FR_ms_MIAMDomesticViolenceChecklist_Value_6"),
    FR_MS_MIAM_DOMESTIC_VIOLENCE_CHECKLIST_VALUE_7("FR_ms_MIAMDomesticViolenceChecklist_Value_7"),
    FR_MS_MIAM_DOMESTIC_VIOLENCE_CHECKLIST_VALUE_8("FR_ms_MIAMDomesticViolenceChecklist_Value_8"),
    FR_MS_MIAM_DOMESTIC_VIOLENCE_CHECKLIST_VALUE_9("FR_ms_MIAMDomesticViolenceChecklist_Value_9"),
    FR_MS_MIAM_DOMESTIC_VIOLENCE_CHECKLIST_VALUE_10("FR_ms_MIAMDomesticViolenceChecklist_Value_10"),
    FR_MS_MIAM_DOMESTIC_VIOLENCE_CHECKLIST_VALUE_11("FR_ms_MIAMDomesticViolenceChecklist_Value_11"),
    FR_MS_MIAM_DOMESTIC_VIOLENCE_CHECKLIST_VALUE_12("FR_ms_MIAMDomesticViolenceChecklist_Value_12"),
    FR_MS_MIAM_DOMESTIC_VIOLENCE_CHECKLIST_VALUE_13("FR_ms_MIAMDomesticViolenceChecklist_Value_13"),
    FR_MS_MIAM_DOMESTIC_VIOLENCE_CHECKLIST_VALUE_14("FR_ms_MIAMDomesticViolenceChecklist_Value_14"),
    FR_MS_MIAM_DOMESTIC_VIOLENCE_CHECKLIST_VALUE_15("FR_ms_MIAMDomesticViolenceChecklist_Value_15"),
    FR_MS_MIAM_DOMESTIC_VIOLENCE_CHECKLIST_VALUE_16("FR_ms_MIAMDomesticViolenceChecklist_Value_16"),
    FR_MS_MIAM_DOMESTIC_VIOLENCE_CHECKLIST_VALUE_17("FR_ms_MIAMDomesticViolenceChecklist_Value_17"),
    FR_MS_MIAM_DOMESTIC_VIOLENCE_CHECKLIST_VALUE_18("FR_ms_MIAMDomesticViolenceChecklist_Value_18"),
    FR_MS_MIAM_DOMESTIC_VIOLENCE_CHECKLIST_VALUE_19("FR_ms_MIAMDomesticViolenceChecklist_Value_19"),
    FR_MS_MIAM_DOMESTIC_VIOLENCE_CHECKLIST_VALUE_20("FR_ms_MIAMDomesticViolenceChecklist_Value_20"),
    FR_MS_MIAM_DOMESTIC_VIOLENCE_CHECKLIST_VALUE_21("FR_ms_MIAMDomesticViolenceChecklist_Value_21"),
    FR_MS_MIAM_DOMESTIC_VIOLENCE_CHECKLIST_VALUE_22("FR_ms_MIAMDomesticViolenceChecklist_Value_22");

    private final String value;

    @JsonValue
    public String getValue() {
        return value;
    }

    @JsonCreator
    public static MiamDomesticViolence forValue(String value) {
        return Arrays.stream(MiamDomesticViolence.values())
            .filter(option -> value.equalsIgnoreCase(option.getValue()))
            .findFirst().orElseThrow(IllegalArgumentException::new);
    }
}
