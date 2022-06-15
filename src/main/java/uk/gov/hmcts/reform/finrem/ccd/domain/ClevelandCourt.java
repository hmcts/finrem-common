package uk.gov.hmcts.reform.finrem.ccd.domain;

import com.fasterxml.jackson.databind.PropertyNamingStrategy;
import com.fasterxml.jackson.databind.annotation.JsonNaming;

@JsonNaming(PropertyNamingStrategy.SnakeCaseStrategy.class)
public enum ClevelandCourt {
    FR_CLEVELAND_LIST_1,
    FR_CLEVELAND_LIST_2,
    FR_CLEVELAND_LIST_3,
    FR_CLEVELAND_LIST_4,
    FR_CLEVELAND_LIST_5,
    FR_CLEVELAND_LIST_6,
    FR_CLEVELAND_LIST_7,
    FR_CLEVELAND_LIST_8
}
