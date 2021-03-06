package uk.gov.hmcts.reform.finrem.ccd.domain;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.databind.PropertyNamingStrategy;
import com.fasterxml.jackson.databind.annotation.JsonNaming;
import lombok.RequiredArgsConstructor;

import java.util.Arrays;

@JsonNaming(PropertyNamingStrategy.SnakeCaseStrategy.class)
@RequiredArgsConstructor
public enum OrderRefusalOption {
    INSUFFICIENT_INFO_A("Insufficient information provided – A"),
    INSUFFICIENT_INFO_B("Insufficient information provided – B"),
    INSUFFICIENT_INFO_C("Insufficient information provided – C"),
    INSUFFICIENT_INFO_D("Insufficient information provided – D"),
    INSUFFICIENT_INFO_E("Insufficient information provided – E"),
    PENSION_ANNEX("Pension annex"),
    RESPONDENT_INDEPENDENT_LEGAL_ADVICE("Respondent – independent legal advice"),
    D81_INCOMPLETE("The D81 incomplete"),
    HEARING_FIXED_FOR_FIRST_AVAILABLE_DATE("Hearing fixed for first available date"),
    TRANSFERRED_TO_APPLICANTS_HOME_COURT("Transferred to Applicant’s home Court"),
    ORDER_DOES_NOT_APPEAR_FAIR("Order does not appear fair"),
    PROVIDE_PENSION_VALUES_PROPERTY("Provide pension values/property"),
    OTHER_PLEASE_SPECIFY("Other (please specify)");

    private final String id;

    @JsonValue
    public String getId() {
        return id;
    }

    @JsonCreator
    public static OrderRefusalOption getOrderRefusalOption(String ccdType) {
        return Arrays.stream(OrderRefusalOption.values())
            .filter(option -> option.id.equals(ccdType))
            .findFirst().orElseThrow(IllegalArgumentException::new);
    }
}
