package uk.gov.hmcts.reform.finrem.ccd.domain;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.databind.PropertyNamingStrategy;
import com.fasterxml.jackson.databind.annotation.JsonNaming;
import lombok.RequiredArgsConstructor;

import java.util.Arrays;

@JsonNaming(PropertyNamingStrategy.SnakeCaseStrategy.class)
@RequiredArgsConstructor
public enum NwYorkshireCourt {
    HARROGATE_COURT("FR_nw_yorkshire_hc_list_1"),
    BRADFORD_COURT("FR_nw_yorkshire_hc_list_2"),
    HUDDERSFIELD_COURT("FR_nw_yorkshire_hc_list_3"),
    WAKEFIELD_COURT("FR_nw_yorkshire_hc_list_4"),
    YORK_COURT("FR_nw_yorkshire_hc_list_5"),
    SCARBOROUGH_COURT("FR_nw_yorkshire_hc_list_6"),
    LEEDS_COURT("FR_nw_yorkshire_hc_list_7"),
    PRESTON_COURT("FR_nw_yorkshire_hc_list_8");

    private final String id;

    @JsonValue
    public String getId() {
        return id;
    }

    @JsonCreator
    public static NwYorkshireCourt getNWYorkshireCourt(String ccdType) {
        return Arrays.stream(NwYorkshireCourt.values())
            .filter(option -> option.id.equals(ccdType))
            .findFirst().orElseThrow(IllegalArgumentException::new);
    }
}
