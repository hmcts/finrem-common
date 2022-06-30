package uk.gov.hmcts.reform.finrem.ccd.domain;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.databind.PropertyNamingStrategy;
import com.fasterxml.jackson.databind.annotation.JsonNaming;
import lombok.RequiredArgsConstructor;

import java.util.Arrays;

@JsonNaming(PropertyNamingStrategy.SnakeCaseStrategy.class)
@RequiredArgsConstructor
public enum AdditionalDocumentType {
    STATEMENT_IN_SUPPORT_INCLUDING_MPS("statementInsupportIncludingMPS"),
    SCHEDULE_OF_ASSETS("scheduleOfAssets"),
    LETTER("letter"),
    NOTICE_OF_ACTING("noticeOfActing"),
    ALLOCATION_QUESTIONNAIRE("allocationQuestionnaire"),
    OTHER("other");

    private final String value;

    @JsonValue
    public String getValue() {
        return value;
    }

    @JsonCreator
    public static AdditionalDocumentType forValue(String value) {
        return Arrays.stream(AdditionalDocumentType.values())
            .filter(option -> value.equalsIgnoreCase(option.getValue()))
            .findFirst().orElseThrow(IllegalArgumentException::new);
    }
}
