package uk.gov.hmcts.reform.finrem.ccd.domain;

import com.fasterxml.jackson.databind.PropertyNamingStrategy;
import com.fasterxml.jackson.databind.annotation.JsonNaming;
import lombok.RequiredArgsConstructor;

@JsonNaming(PropertyNamingStrategy.SnakeCaseStrategy.class)
@RequiredArgsConstructor
public enum RegionNorthEastFrc {
    CLEVELAND("cleveland"),
    NW_YORKSHIRE("nwyorkshire"),
    HS_YORKSHIRE("hsyorkshire");

    private final String value;

    public String getValue() {
        return value;
    }
}
