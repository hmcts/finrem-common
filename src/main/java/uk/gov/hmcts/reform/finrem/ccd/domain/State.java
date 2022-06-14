package uk.gov.hmcts.reform.finrem.ccd.domain;

import com.fasterxml.jackson.annotation.JsonEnumDefaultValue;
import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.databind.PropertyNamingStrategy;
import com.fasterxml.jackson.databind.annotation.JsonNaming;
import lombok.RequiredArgsConstructor;

@JsonNaming(PropertyNamingStrategy.SnakeCaseStrategy.class)
public enum State {

    CASE_ADDED,
    NEW_PAPER_CASE,
    AWAITING_HWF_DECISION,
    AWAITING_PAYMENT,
    AWAITING_PAYMENT_RESPONSE,
    APPLICATION_SUBMITTED,
    APPLICATION_ISSUED,
    REFERRED_TO_JUDGE,
    ORDER_MADE,
    CONSENT_ORDER_APPROVED,
    CONSENT_ORDER_MADE,
    AWAITING_RESPONSE,
    RESPONSE_RECEIVED,
    AWAITING_INFO,
    INFO_RECEIVED,
    CLOSE,
    GATE_KEEPING_AND_ALLOCATION,
    SCHEDULING_AND_HEARING,
    JUDGE_DRAFT_ORDER,
    SOLICITOR_DRAFT_ORDER,
    REVIEW_ORDER,
    DRAFT_ORDER_NOT_APPROVED,
    SCHEDULE_RAISE_DIRECTIONS_ORDER,
    ORDER_DRAWN,
    ORDER_SENT,
    CONSENTED_ORDER_SUBMITTED,
    AWAITING_JUDICIARY_RESPONSE_CONSENT,
    CONSENTED_ORDER_ASSIGN_JUDGE,
    CONSENTED_ORDER_APPROVED,
    CONSENTED_ORDER_NOT_APPROVED,
    GENERAL_APPLICATION,
    GENERAL_APPLICATION_AWAITING_JUDICIARY_RESPONSE,
    GENERAL_APPLICATION_OUTCOME

}
