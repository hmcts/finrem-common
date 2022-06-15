package uk.gov.hmcts.reform.finrem.ccd.domain;

import com.fasterxml.jackson.databind.PropertyNamingStrategy;
import com.fasterxml.jackson.databind.annotation.JsonNaming;

@JsonNaming(PropertyNamingStrategy.SnakeCaseStrategy.class)
public enum DevonCourt {
    FR_devonList_1,
    FR_devonList_2,
    FR_devonList_3,
    FR_devonList_4,
    FR_devonList_5,
    FR_devonList_6,
    FR_devonList_7,
    FR_devonList_8
}
