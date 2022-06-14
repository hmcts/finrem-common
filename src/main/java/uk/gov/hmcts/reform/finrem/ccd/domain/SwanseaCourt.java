package uk.gov.hmcts.reform.finrem.ccd.domain;

import com.fasterxml.jackson.databind.PropertyNamingStrategy;
import com.fasterxml.jackson.databind.annotation.JsonNaming;

@JsonNaming(PropertyNamingStrategy.SnakeCaseStrategy.class)
public enum SwanseaCourt {
    FR_swanseaList_1,
    FR_swanseaList_2,
    FR_swanseaList_3,
    FR_swanseaList_4,
    FR_swanseaList_5,
    FR_swanseaList_6
}
