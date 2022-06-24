package uk.gov.hmcts.reform.finrem.ccd.domain;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import lombok.RequiredArgsConstructor;

import java.util.Arrays;

@RequiredArgsConstructor
public enum BirminghamCourt {
    BIRMINGHAM_CIVIL_AND_FAMILY_JUSTICE_CENTRE("FR_s_birminghamList_1"),
    COVENTRY_COMBINED_COURT_CENTRE("FR_s_birminghamList_2"),
    TELFORD_COUNTY_COURT_AND_FAMILY_COURT("FR_s_birminghamList_3"),
    WOLVERHAMPTON_COMBINED_COURT_CENTRE("FR_s_birminghamList_4"),
    DUDLEY_COUNTY_COURT_AND_FAMILY_COURT("FR_s_birminghamList_5"),
    WALSALL_COUNTY_AND_FAMILY_COURT("FR_s_birminghamList_6"),
    STOKE_ON_TRENT_COMBINED_COURT("FR_s_birminghamList_7"),
    WORCESTER_COMBINED_COURT("FR_s_birminghamList_8"),
    STAFFORD_COMBINED_COURT("FR_s_birminghamList_9"),
    HEREFORD_COUNTY_COURT_AND_FAMILY_COURT("FR_s_birminghamList_10");


    private final String id;

    @JsonValue
    public String getId() {
        return id;
    }

    @JsonCreator
    public static BirminghamCourt getBirminghamCourt(String ccdType) {
        return Arrays.stream(BirminghamCourt.values())
            .filter(option -> option.id.equals(ccdType))
            .findFirst().orElseThrow(IllegalArgumentException::new);
    }

}
