package uk.gov.hmcts.reform.finrem.ccd.domain;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.databind.PropertyNamingStrategy;
import com.fasterxml.jackson.databind.annotation.JsonNaming;
import lombok.RequiredArgsConstructor;

import java.util.Arrays;

@JsonNaming(PropertyNamingStrategy.SnakeCaseStrategy.class)
@RequiredArgsConstructor
public enum MiamExemption {
    DOMESTIC_VIOLENCE("domesticViolence", "Domestic violence"),
    URGENCY("urgency", "Urgency"),
    PREVIOUS_MIAM_ATTENDANCE("previousMIAMattendance", "Previous MIAM attendance or previous MIAM exemption"),
    OTHER("other", "Other");

    private final String value;
    private final String text;

    @JsonValue
    public String getValue() {
        return value;
    }

    public String getText() {
        return text;
    }

    @JsonCreator
    public static MiamExemption forValue(String value) {
        return Arrays.stream(MiamExemption.values())
            .filter(option -> value.equalsIgnoreCase(option.getValue()))
            .findFirst().orElseThrow(IllegalArgumentException::new);
    }
}
