package uk.gov.hmcts.reform.finrem.ccd.domain;

import com.fasterxml.jackson.databind.PropertyNamingStrategy;
import com.fasterxml.jackson.databind.annotation.JsonNaming;

@JsonNaming(PropertyNamingStrategy.SnakeCaseStrategy.class)
public enum AssignToJudgeReason {
    DRAFT_CONSENT_ORDER,
    RESUBMITTED_DRAFT_CONSENT_ORDER,
    NEW_CASE_ACCEPTED_BY_JUDGE
}
