package uk.gov.hmcts.reform.finrem.ccd.domain;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.databind.PropertyNamingStrategy;
import com.fasterxml.jackson.databind.annotation.JsonNaming;
import lombok.RequiredArgsConstructor;

import java.util.Arrays;

@JsonNaming(PropertyNamingStrategy.SnakeCaseStrategy.class)
@RequiredArgsConstructor
public enum BedfordshireCourt {
    FR_bedfordshireList_1("FR_bedfordshireList_1"),
    FR_bedfordshireList_2("FR_bedfordshireList_2"),
    FR_bedfordshireList_3("FR_bedfordshireList_3"),
    FR_bedfordshireList_4("FR_bedfordshireList_4"),
    FR_bedfordshireList_5("FR_bedfordshireList_5"),
    FR_bedfordshireList_6("FR_bedfordshireList_6"),
    FR_bedfordshireList_7("FR_bedfordshireList_7"),
    FR_bedfordshireList_8("FR_bedfordshireList_8"),
    FR_bedfordshireList_9("FR_bedfordshireList_9"),
    FR_bedfordshireList_10("FR_bedfordshireList_10"),
    FR_bedfordshireList_11("FR_bedfordshireList_11");

    private final String id;

    @JsonValue
    public String getId() {
        return id;
    }

    @JsonCreator
    public static BedfordshireCourt getBedfordshireCourt(String ccdType) {
        return Arrays.stream(BedfordshireCourt.values())
            .filter(option -> option.id.equals(ccdType))
            .findFirst().orElseThrow(IllegalArgumentException::new);
    }

}
