package uk.gov.hmcts.reform.finrem.ccd.domain;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.databind.PropertyNamingStrategy;
import com.fasterxml.jackson.databind.annotation.JsonNaming;
import lombok.RequiredArgsConstructor;

import java.util.Arrays;

@JsonNaming(PropertyNamingStrategy.SnakeCaseStrategy.class)
@RequiredArgsConstructor
public enum HumberCourt {
    FR_humberList_1("FR_humber_hc_list_1"),
    FR_humberList_2("FR_humber_hc_list_2"),
    FR_humberList_3("FR_humber_hc_list_3"),
    FR_humberList_4("FR_humber_hc_list_4"),
    FR_humberList_5("FR_humber_hc_list_5");

    private final String id;

    @JsonValue
    public String getId() {
        return id;
    }

    @JsonCreator
    public static HumberCourt getHumberCourt(String ccdType) {
        return Arrays.stream(HumberCourt.values())
            .filter(option -> option.id.equals(ccdType))
            .findFirst().orElseThrow(IllegalArgumentException::new);
    }
}
