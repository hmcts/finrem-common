package uk.gov.hmcts.reform.finrem.ccd.domain;

import com.fasterxml.jackson.databind.PropertyNamingStrategy;
import com.fasterxml.jackson.databind.annotation.JsonNaming;

@JsonNaming(PropertyNamingStrategy.SnakeCaseStrategy.class)
public enum NorthWalesCourt {
    FR_northwalesList_1,
    FR_northwalesList_2,
    FR_northwalesList_3,
    FR_northwalesList_4,
    FR_northwalesList_5
}
