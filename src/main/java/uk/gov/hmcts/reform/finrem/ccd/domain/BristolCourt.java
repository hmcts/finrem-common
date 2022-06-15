package uk.gov.hmcts.reform.finrem.ccd.domain;

import com.fasterxml.jackson.databind.PropertyNamingStrategy;
import com.fasterxml.jackson.databind.annotation.JsonNaming;

@JsonNaming(PropertyNamingStrategy.SnakeCaseStrategy.class)
public enum BristolCourt {
    FR_bristolList_1,
    FR_bristolList_2,
    FR_bristolList_3,
    FR_bristolList_4,
    FR_bristolList_5,
    FR_bristolList_6
}
