package uk.gov.hmcts.reform.finrem.ccd.domain;

import com.fasterxml.jackson.annotation.JsonEnumDefaultValue;
import com.fasterxml.jackson.annotation.JsonValue;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public enum State {

    CASE_ADDED("caseAdded"),
    NEW_PAPER_CASE("newPaperCase"),
    AWAITING_HWF_DECISION("awaitingHWFDecision"),
    AWAITING_PAYMENT("awaitingPayment"),
    AWAITING_PAYMENT_RESPONSE("awaitingPaymentResponse"),
    APPLICATION_SUBMITTED("applicationSubmitted"),
    APPLICATION_ISSUED("applicationIssued"),
    REFERRED_TO_JUDGE("referredToJudge"),
    ORDER_MADE("orderMade"),
    CONSENT_ORDER_APPROVED("consentOrderApproved"),
    CONSENT_ORDER_MADE("consentOrderMade"),
    AWAITING_RESPONSE("awaitingResponse"),
    RESPONSE_RECEIVED("responseReceived"),
    AWAITING_INFO("awaitingInfo"),
    INFO_RECEIVED("infoReceived"),
    CLOSE("close"),
    GATE_KEEPING_AND_ALLOCATION("gateKeepingAndAllocation"),
    SCHEDULING_AND_HEARING("schedulingAndHearing"),
    JUDGE_DRAFT_ORDER("judgeDraftOrder"),
    SOLICITOR_DRAFT_ORDER("solicitorDraftOrder"),
    REVIEW_ORDER("reviewOrder"),
    DRAFT_ORDER_NOT_APPROVED("draftOrderNotApproved"),
    SCHEDULE_RAISE_DIRECTIONS_ORDER("scheduleRaiseDirectionsOrder"),
    ORDER_DRAWN("orderDrawn"),
    ORDER_SENT("orderSent"),
    CONSENTED_ORDER_SUBMITTED("consentedOrderSubmitted"),
    AWAITING_JUDICIARY_RESPONSE_CONSENT("awaitingJudiciaryResponseConsent"),
    CONSENTED_ORDER_ASSIGN_JUDGE("consentedOrderAssignJudge"),
    CONSENTED_ORDER_APPROVED("consentedOrderApproved"),
    CONSENTED_ORDER_NOT_APPROVED("consentedOrderNotApproved"),
    GENERAL_APPLICATION("generalApplication"),
    GENERAL_APPLICATION_AWAITING_JUDICIARY_RESPONSE("generalApplicationAwaitingJudiciaryResponse"),
    GENERAL_APPLICATION_OUTCOME("generalApplicationOutcome"),
    @JsonEnumDefaultValue
    UNKNOWN("unknown");

    private final String id;

    @JsonValue
    public String getId() {
        return id;
    }

}
