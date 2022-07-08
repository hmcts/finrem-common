package uk.gov.hmcts.reform.finrem.ccd.domain;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import lombok.RequiredArgsConstructor;

import java.util.Arrays;

@RequiredArgsConstructor
public enum SendOrderEventPostStateOption {
    PREPARE_FOR_HEARING("prepareForHearing", EventType.PREPARE_FOR_HEARING),
    CLOSE("close", EventType.CLOSE),
    ORDER_SENT("orderSent", EventType.NONE),
    NONE("", EventType.NONE);

    private final String value;
    private final EventType eventToTrigger;

    @JsonValue
    public String getValue() {
        return value;
    }

    public EventType getEventToTrigger() {
        return eventToTrigger;
    }

    @JsonCreator
    public static SendOrderEventPostStateOption forValue(String value) {
        return Arrays.stream(SendOrderEventPostStateOption.values())
            .filter(option -> value.equalsIgnoreCase(option.getValue()))
            .findFirst().orElseThrow(IllegalArgumentException::new);
    }
}
