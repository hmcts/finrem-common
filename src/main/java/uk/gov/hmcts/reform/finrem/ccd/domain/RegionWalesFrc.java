package uk.gov.hmcts.reform.finrem.ccd.domain;

import com.fasterxml.jackson.databind.PropertyNamingStrategy;
import com.fasterxml.jackson.databind.annotation.JsonNaming;
import lombok.RequiredArgsConstructor;

@JsonNaming(PropertyNamingStrategy.SnakeCaseStrategy.class)
@RequiredArgsConstructor
public enum RegionWalesFrc {
    NEWPORT("newport"),
    SWANSEA("swansear"),
    NORTH_WALES("northwales");

    private final String value;

    public String getValue() {
        return value;
    }
}
