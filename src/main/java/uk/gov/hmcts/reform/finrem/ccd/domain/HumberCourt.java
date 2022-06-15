package uk.gov.hmcts.reform.finrem.ccd.domain;

import com.fasterxml.jackson.databind.PropertyNamingStrategy;
import com.fasterxml.jackson.databind.annotation.JsonNaming;

@JsonNaming(PropertyNamingStrategy.SnakeCaseStrategy.class)
public enum HumberCourt {
    FR_humberList_1,
    FR_humberList_2,
    FR_humberList_3,
    FR_humberList_4,
    FR_humberList_5
}
