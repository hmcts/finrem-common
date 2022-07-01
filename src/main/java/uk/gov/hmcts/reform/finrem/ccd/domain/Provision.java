package uk.gov.hmcts.reform.finrem.ccd.domain;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import lombok.RequiredArgsConstructor;

import java.util.Arrays;

@RequiredArgsConstructor
public enum Provision {
    MATRIMONIAL_OR_CIVIL_PARTNERSHIP_PROCEEDINGS("matrimonialOrCivilPartnershipProceedings"),
    CHILDREN_ACT_1989("childrenAct1989");

    private final String value;

    @JsonValue
    public String getValue() {
        return value;
    }

    @JsonCreator
    public static Provision forValue(String value) {
        return Arrays.stream(Provision.values())
            .filter(option -> value.equalsIgnoreCase(option.getValue()))
            .findFirst().orElseThrow(IllegalArgumentException::new);
    }
}
