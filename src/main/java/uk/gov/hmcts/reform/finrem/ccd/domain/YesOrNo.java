package uk.gov.hmcts.reform.finrem.ccd.domain;

import com.fasterxml.jackson.annotation.JsonValue;
import lombok.RequiredArgsConstructor;

import static java.util.Objects.isNull;

@RequiredArgsConstructor
public enum YesOrNo {
    YES("Yes"),
    NO("No");

    private final String value;

    @JsonValue
    public String getYesOrNo() {
        return value;
    }

    public boolean isYes() {
        return value.equalsIgnoreCase("Yes");
    }

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

    public boolean isNoOrNull() {
        return isNull(value) || value.equalsIgnoreCase("No");
    }
}
