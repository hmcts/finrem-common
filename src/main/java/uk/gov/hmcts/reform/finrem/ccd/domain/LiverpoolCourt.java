package uk.gov.hmcts.reform.finrem.ccd.domain;

import com.fasterxml.jackson.databind.PropertyNamingStrategy;
import com.fasterxml.jackson.databind.annotation.JsonNaming;

@JsonNaming(PropertyNamingStrategy.SnakeCaseStrategy.class)
public enum LiverpoolCourt {
    FR_liverpoolList_1,
    FR_liverpoolList_2,
    FR_liverpoolList_3,
    FR_liverpoolList_4,
    FR_liverpoolList_5
}
