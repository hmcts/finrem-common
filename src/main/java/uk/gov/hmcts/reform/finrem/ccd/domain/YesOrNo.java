package uk.gov.hmcts.reform.finrem.ccd.domain;

import com.fasterxml.jackson.databind.PropertyNamingStrategy;
import com.fasterxml.jackson.databind.annotation.JsonNaming;

import static java.util.Objects.isNull;

@JsonNaming(PropertyNamingStrategy.SnakeCaseStrategy.class)
public enum YesOrNo {
    YES,
    NO;

    public static boolean isYes(YesOrNo yesOrNo) {
        return YES.equals(yesOrNo);
    }

    public static boolean isYes(String yesOrNo) {
        return YES.toString().equalsIgnoreCase(yesOrNo);
    }

    public static boolean isNoOrNull(YesOrNo yesOrNo) {
        return isNull(yesOrNo) || NO.equals(yesOrNo);
    }

    public static boolean isNoOrNull(String yesOrNo) {
        return isNull(yesOrNo) || NO.toString().equalsIgnoreCase(yesOrNo);
    }
}
