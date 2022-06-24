package uk.gov.hmcts.reform.finrem.ccd.domain;

import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.databind.PropertyNamingStrategy;
import com.fasterxml.jackson.databind.annotation.JsonNaming;
import lombok.RequiredArgsConstructor;

import static java.util.Objects.isNull;

@JsonNaming(PropertyNamingStrategy.SnakeCaseStrategy.class)
@RequiredArgsConstructor
public enum YesOrNo {
    YES("Yes"),
    NO("No");

    private final String yesOrNo;

    @JsonValue
    public String getYesOrNo() {
        return yesOrNo;
    }

    public boolean isYes() {
        return yesOrNo.equalsIgnoreCase("Yes");
    }

    public boolean isNoOrNull() {
        return isNull(yesOrNo) || yesOrNo.equalsIgnoreCase("No");
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

}
