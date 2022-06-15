package uk.gov.hmcts.reform.finrem.ccd.domain;

import com.fasterxml.jackson.databind.PropertyNamingStrategy;
import com.fasterxml.jackson.databind.annotation.JsonNaming;

@JsonNaming(PropertyNamingStrategy.SnakeCaseStrategy.class)
public enum Region {
    MIDLANDS,
    LONDON,
    NORTHWEST,
    NORTHEAST,
    SOUTHEAST,
    SOUTHWEST,
    WALES
}
