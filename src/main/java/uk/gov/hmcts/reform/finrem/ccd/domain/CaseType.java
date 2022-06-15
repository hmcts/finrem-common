package uk.gov.hmcts.reform.finrem.ccd.domain;

import com.fasterxml.jackson.annotation.JsonEnumDefaultValue;
import com.fasterxml.jackson.annotation.JsonValue;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public enum CaseType {

    CONSENTED("FinancialRemedyMVP2"),
    CONTESTED("FinancialRemedyContested"),
    @JsonEnumDefaultValue
    UNKNOWN("unknown");

    private final String ccdType;

    @JsonValue
    public String getCcdType() {
        return ccdType;
    }
}