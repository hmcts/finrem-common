package uk.gov.hmcts.reform.finrem.ccd.domain;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.databind.PropertyNamingStrategy;
import com.fasterxml.jackson.databind.annotation.JsonNaming;
import lombok.RequiredArgsConstructor;

import java.util.Arrays;

@RequiredArgsConstructor
public enum PaymentDocumentType {
    COPY_OF_PAPER_FORM_A("Copy of paper form A");

    private final String value;

    @JsonValue
    public String getValue() {
        return value;
    }

    @JsonCreator
    public static PaymentDocumentType forValue(String value) {
        return Arrays.stream(PaymentDocumentType.values())
            .filter(option -> value.equalsIgnoreCase(option.getValue()))
            .findFirst().orElseThrow(IllegalArgumentException::new);
    }
}
