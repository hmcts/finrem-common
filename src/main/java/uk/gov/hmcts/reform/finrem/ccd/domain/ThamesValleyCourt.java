package uk.gov.hmcts.reform.finrem.ccd.domain;

import com.fasterxml.jackson.databind.PropertyNamingStrategy;
import com.fasterxml.jackson.databind.annotation.JsonNaming;

@JsonNaming(PropertyNamingStrategy.SnakeCaseStrategy.class)
public enum ThamesValleyCourt {
    FR_thamesvalleyList_1,
    FR_thamesvalleyList_2,
    FR_thamesvalleyList_3,
    FR_thamesvalleyList_4
}
