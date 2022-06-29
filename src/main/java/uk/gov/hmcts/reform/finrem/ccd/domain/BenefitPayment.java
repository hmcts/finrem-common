package uk.gov.hmcts.reform.finrem.ccd.domain;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.databind.PropertyNamingStrategy;
import com.fasterxml.jackson.databind.annotation.JsonNaming;
import lombok.RequiredArgsConstructor;

import java.util.Arrays;

@JsonNaming(PropertyNamingStrategy.SnakeCaseStrategy.class)
@RequiredArgsConstructor
public enum BenefitPayment {
    BENEFIT_CHECKLIST_VALUE_1("Step child or step children"),
    BENEFIT_CHECKLIST_VALUE_2("In addition to child support maintenance already paid under a Child "
        + "Support Agency assessment"),
    BENEFIT_CHECKLIST_VALUE_3("To meet expenses arising from a child’s disability"),
    BENEFIT_CHECKLIST_VALUE_4("To meet expenses incurred by a child being in educated or training for work"),
    BENEFIT_CHECKLIST_VALUE_5("The child or the person with care of the child or the absent parent of the child is "
        + "not habitually resident in the United Kingdom");

    private final String value;

    @JsonValue
    public String getValue() {
        return value;
    }

    @JsonCreator
    public static BenefitPayment forValue(String value) {
        return Arrays.stream(BenefitPayment.values())
            .filter(option -> value.equalsIgnoreCase(option.getValue()))
            .findFirst().orElseThrow(IllegalArgumentException::new);
    }
}
