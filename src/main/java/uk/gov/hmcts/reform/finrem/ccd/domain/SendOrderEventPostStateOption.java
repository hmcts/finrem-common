package uk.gov.hmcts.reform.finrem.ccd.domain;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.databind.PropertyNamingStrategy;
import com.fasterxml.jackson.databind.annotation.JsonNaming;
import lombok.RequiredArgsConstructor;

import java.util.Arrays;

@RequiredArgsConstructor
public enum SendOrderEventPostStateOption {
    PREPARE_FOR_HEARING("prepareForHearing"),
    CLOSE("close"),
    ORDER_SENT("orderSent");

    private final String value;

    @JsonValue
    public String getValue() {
        return value;
    }

    @JsonCreator
    public static SendOrderEventPostStateOption forValue(String value) {
        return Arrays.stream(SendOrderEventPostStateOption.values())
            .filter(option -> value.equalsIgnoreCase(option.getValue()))
            .findFirst().orElseThrow(IllegalArgumentException::new);
    }
}
