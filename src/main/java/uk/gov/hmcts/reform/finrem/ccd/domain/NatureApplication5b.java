package uk.gov.hmcts.reform.finrem.ccd.domain;

import com.fasterxml.jackson.databind.PropertyNamingStrategy;
import com.fasterxml.jackson.databind.annotation.JsonNaming;

@JsonNaming(PropertyNamingStrategy.SnakeCaseStrategy.class)
public enum NatureApplication5b {
    FR_NATURE_OF_APPLICATION_1,
    FR_NATURE_OF_APPLICATION_2,
    FR_NATURE_OF_APPLICATION_3
}
