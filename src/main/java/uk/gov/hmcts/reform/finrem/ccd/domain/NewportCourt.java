package uk.gov.hmcts.reform.finrem.ccd.domain;

import com.fasterxml.jackson.databind.PropertyNamingStrategy;
import com.fasterxml.jackson.databind.annotation.JsonNaming;

@JsonNaming(PropertyNamingStrategy.SnakeCaseStrategy.class)
public enum NewportCourt {
    FR_newportList_1,
    FR_newportList_2,
    FR_newportList_3,
    FR_newportList_4,
    FR_newportList_5
}
