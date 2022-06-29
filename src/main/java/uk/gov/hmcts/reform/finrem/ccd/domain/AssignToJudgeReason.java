package uk.gov.hmcts.reform.finrem.ccd.domain;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.databind.PropertyNamingStrategy;
import com.fasterxml.jackson.databind.annotation.JsonNaming;
import lombok.RequiredArgsConstructor;

import java.util.Arrays;

@JsonNaming(PropertyNamingStrategy.SnakeCaseStrategy.class)
@RequiredArgsConstructor
public enum AssignToJudgeReason {
    DRAFT_CONSENT_ORDER("Draft consent order"),
    RESUBMITTED_DRAFT_CONSENT_ORDER("Resubmitted draft consent order"),
    NEW_CASE_ACCEPTED_BY_JUDGE("New case accepted by Judge");

    private final String value;

    @JsonValue
    public String getValue() {
        return value;
    }

    @JsonCreator
    public static AssignToJudgeReason forValue(String value) {
        return Arrays.stream(AssignToJudgeReason.values())
            .filter(option -> value.equalsIgnoreCase(option.getValue()))
            .findFirst().orElseThrow(IllegalArgumentException::new);
    }
}
