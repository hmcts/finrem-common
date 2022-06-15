package uk.gov.hmcts.reform.finrem.ccd.domain;

import com.fasterxml.jackson.databind.PropertyNamingStrategy;
import com.fasterxml.jackson.databind.annotation.JsonNaming;

@JsonNaming(PropertyNamingStrategy.SnakeCaseStrategy.class)
public enum JudgeAllocated {
    FR_JUDGE_ALLOCATED_LIST_1,
    FR_JUDGE_ALLOCATED_LIST_2,
    FR_JUDGE_ALLOCATED_LIST_3
}
