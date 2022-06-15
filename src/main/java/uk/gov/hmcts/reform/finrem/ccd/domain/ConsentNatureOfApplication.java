package uk.gov.hmcts.reform.finrem.ccd.domain;

import com.fasterxml.jackson.databind.PropertyNamingStrategy;
import com.fasterxml.jackson.databind.annotation.JsonNaming;

@JsonNaming(PropertyNamingStrategy.SnakeCaseStrategy.class)
public enum ConsentNatureOfApplication {
    STEP_CHILD_OR_STEP_CHILDREN,
    IN_ADDITION_TO_CHILD_SUPPORT,
    DISABILITY_EXPENSES,
    TRAINING,
    WHEN_NOT_HABITUALLY_RESIDENT,
    OTHER
}
