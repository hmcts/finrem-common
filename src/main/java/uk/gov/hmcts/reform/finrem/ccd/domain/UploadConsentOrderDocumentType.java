package uk.gov.hmcts.reform.finrem.ccd.domain;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.databind.PropertyNamingStrategy;
import com.fasterxml.jackson.databind.annotation.JsonNaming;
import lombok.RequiredArgsConstructor;

import java.util.Arrays;

@JsonNaming(PropertyNamingStrategy.SnakeCaseStrategy.class)
@RequiredArgsConstructor
public enum UploadConsentOrderDocumentType {
    CONSENT_ORDER("consentOrder"),
    COVER_ORDER("coverOrder"),
    P1("P1"),
    P2("P2"),
    PPF("PPF"),
    PPF1("PPF1"),
    PPF2("PPF2"),
    OTHER("Other");

    private final String value;

    @JsonValue
    public String getValue() {
        return value;
    }

    @JsonCreator
    public static UploadConsentOrderDocumentType forValue(String value) {
        return Arrays.stream(UploadConsentOrderDocumentType.values())
            .filter(option -> value.equalsIgnoreCase(option.getValue()))
            .findFirst().orElseThrow(IllegalArgumentException::new);
    }
}
