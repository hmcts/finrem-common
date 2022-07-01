package uk.gov.hmcts.reform.finrem.ccd.domain;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.databind.PropertyNamingStrategy;
import com.fasterxml.jackson.databind.annotation.JsonNaming;
import lombok.RequiredArgsConstructor;

import java.util.Arrays;

@RequiredArgsConstructor
public enum PotentialAllegation {
    POTENTIAL_ALLEGATION_CHECKLIST_1("potentialAllegationChecklist_1"),
    POTENTIAL_ALLEGATION_CHECKLIST_2("potentialAllegationChecklist_2"),
    POTENTIAL_ALLEGATION_CHECKLIST_3("potentialAllegationChecklist_3"),
    POTENTIAL_ALLEGATION_CHECKLIST_4("potentialAllegationChecklist_4"),
    POTENTIAL_ALLEGATION_CHECKLIST_5("potentialAllegationChecklist_5"),
    POTENTIAL_ALLEGATION_CHECKLIST_6("potentialAllegationChecklist_6"),
    POTENTIAL_ALLEGATION_CHECKLIST_7("potentialAllegationChecklist_7"),
    POTENTIAL_ALLEGATION_CHECKLIST_8("potentialAllegationChecklist_8"),
    POTENTIAL_ALLEGATION_CHECKLIST_9("potentialAllegationChecklist_9"),
    POTENTIAL_ALLEGATION_CHECKLIST_10("potentialAllegationChecklist_10"),
    POTENTIAL_ALLEGATION_CHECKLIST_11("potentialAllegationChecklist_11"),
    POTENTIAL_ALLEGATION_CHECKLIST_12("potentialAllegationChecklist_12"),
    POTENTIAL_ALLEGATION_CHECKLIST_13("potentialAllegationChecklist_13"),
    POTENTIAL_ALLEGATION_CHECKLIST_14("potentialAllegationChecklist_14"),
    NOT_APPLICABLE("notApplicable");

    private final String value;

    @JsonValue
    public String getValue() {
        return value;
    }

    @JsonCreator
    public static PotentialAllegation forValue(String value) {
        return Arrays.stream(PotentialAllegation.values())
            .filter(option -> value.equalsIgnoreCase(option.getValue()))
            .findFirst().orElseThrow(IllegalArgumentException::new);
    }
}
