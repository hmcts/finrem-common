package uk.gov.hmcts.reform.finrem.ccd.domain;

import java.util.Arrays;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonEnumDefaultValue;
import com.fasterxml.jackson.annotation.JsonValue;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public enum FastTrackReason {
    PERIODICAL_PAYMENTS_ORDER_NOT_SEEK_TO_DISMISS("reason_1"),
    RECOGNITION_AND_ENFORCEMENT("reason_2"),
    ORDER_FOR_PERIODICAL_PAYMENTS("reason_3"),
    FINANCIAL_PROVISION("reason_4");

    private final String id;

    @JsonValue
    public String getId() {
        return id;
    }

    @JsonCreator
    public static FastTrackReason getFastTrackReason(String ccdType) {
        return Arrays.stream(FastTrackReason.values())
            .filter(option -> option.id.equals(ccdType))
            .findFirst().orElseThrow(IllegalArgumentException::new);
    }
}
