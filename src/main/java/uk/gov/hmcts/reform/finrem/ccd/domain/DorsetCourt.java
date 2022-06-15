package uk.gov.hmcts.reform.finrem.ccd.domain;

import com.fasterxml.jackson.databind.PropertyNamingStrategy;
import com.fasterxml.jackson.databind.annotation.JsonNaming;

@JsonNaming(PropertyNamingStrategy.SnakeCaseStrategy.class)
public enum DorsetCourt {
    FR_DORSET_LIST_1,
    FR_DORSET_LIST_2,
    FR_DORSET_LIST_3,
    FR_DORSET_LIST_4,
    FR_DORSET_LIST_5,
    FR_DORSET_LIST_6,
    FR_DORSET_LIST_7,
    FR_DORSET_LIST_8
}
