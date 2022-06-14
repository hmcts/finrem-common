package uk.gov.hmcts.reform.finrem.ccd.domain;

import java.util.Arrays;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.databind.PropertyNamingStrategy;
import com.fasterxml.jackson.databind.annotation.JsonNaming;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public enum HearingTypeDirection {
    FDA("First Directions Appointment (FDA)"),
    FDR("Financial Dispute Resolution (FDR)"),
    FH("Final Hearing (FH)"),
    DIR("Directions (DIR)");

    private final String id;

    @JsonValue
    public String getId() {
        return id;
    }

    @JsonCreator
    public static HearingTypeDirection getHearingTypeDirection(String ccdType) {
        return Arrays.stream(HearingTypeDirection.values())
            .filter(option -> option.id.equals(ccdType))
            .findFirst().orElseThrow(IllegalArgumentException::new);
    }
}
