package uk.gov.hmcts.reform.finrem.ccd.domain;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.PropertyNamingStrategy;
import com.fasterxml.jackson.databind.annotation.JsonNaming;

@JsonNaming(PropertyNamingStrategy.SnakeCaseStrategy.class)
public enum RegionNorthEastFrc {
    @JsonProperty("cleveland")
    CLEVELAND,
    @JsonProperty("nwyorkshire")
    NW_YORKSHIRE,
    @JsonProperty("hsyorkshire")
    HS_YORKSHIRE
}
