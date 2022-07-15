package uk.gov.hmcts.reform.finrem.ccd.domain;

import com.fasterxml.jackson.annotation.JsonValue;
import lombok.RequiredArgsConstructor;

import java.util.Arrays;

@RequiredArgsConstructor
public enum StageReached {
    DECREE_NISI("Decree Nisi"),
    DECREE_ABSOLUTE("Decree Absolute"),
    PETITION_ISSUED("Petition Issued");

    private final String value;

    @JsonValue
    public String getValue() {
        return value;
    }

    public static StageReached forValue(String selectedStage) {
        return Arrays.stream(StageReached.values())
            .filter(option -> selectedStage.equalsIgnoreCase(option.getValue()))
            .findFirst().orElseThrow(IllegalArgumentException::new);
    }
}
