package uk.gov.hmcts.reform.finrem.ccd.domain;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.databind.PropertyNamingStrategy;
import com.fasterxml.jackson.databind.annotation.JsonNaming;
import lombok.RequiredArgsConstructor;

import java.util.Arrays;

@RequiredArgsConstructor
public enum JudgeAllocated {
    FR_JUDGE_ALLOCATED_LIST_1("FR_judgeAllocatedList_1"),
    FR_JUDGE_ALLOCATED_LIST_2("FR_judgeAllocatedList_2"),
    FR_JUDGE_ALLOCATED_LIST_3("FR_judgeAllocatedList_3");

    private final String value;

    @JsonValue
    public String getValue() {
        return value;
    }

    @JsonCreator
    public static JudgeAllocated forValue(String value) {
        return Arrays.stream(JudgeAllocated.values())
            .filter(option -> value.equalsIgnoreCase(option.getValue()))
            .findFirst().orElseThrow(IllegalArgumentException::new);
    }
}
