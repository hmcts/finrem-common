package uk.gov.hmcts.reform.finrem.ccd.domain;

import com.fasterxml.jackson.databind.PropertyNamingStrategy;
import com.fasterxml.jackson.databind.annotation.JsonNaming;

@JsonNaming(PropertyNamingStrategy.SnakeCaseStrategy.class)
public enum LancashireCourt {
    FR_lancashireList_1,
    FR_lancashireList_2,
    FR_lancashireList_3,
    FR_lancashireList_4,
    FR_lancashireList_5,
    FR_lancashireList_6,
    FR_lancashireList_7,
    FR_lancashireList_8,
    FR_lancashireList_9
}
