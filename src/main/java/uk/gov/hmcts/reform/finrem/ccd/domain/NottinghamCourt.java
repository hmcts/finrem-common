package uk.gov.hmcts.reform.finrem.ccd.domain;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import lombok.RequiredArgsConstructor;

import java.util.Arrays;

@RequiredArgsConstructor
public enum NottinghamCourt {

    NOTTINGHAM_COUNTY_COURT_AND_FAMILY_COURT("FR_nottinghamList_1"),
    DERBY_COMBINED_COURT_CENTRE("FR_nottinghamList_2"),
    LEICESTER_COUNTY_COURT_AND_FAMILY_COURT("FR_nottinghamList_3"),
    LINCOLN_COUNTY_COURT_AND_FAMILY_COURT("FR_nottinghamList_4"),
    NORTHAMPTON_CROWN_COUNTY_AND_FAMILY_COURT("FR_nottinghamList_5"),
    CHESTERFIELD_COUNTY_COURT("FR_nottinghamList_6"),
    MANSFIELD_MAGISTRATES_AND_COUNTY_COURT("FR_nottinghamList_7"),
    BOSTON_COUNTY_COURT_AND_FAMILY_COURT("FR_nottinghamList_8");


    private final String id;

    @JsonValue
    public String getId() {
        return id;
    }

    @JsonCreator
    public static NottinghamCourt getNottinghamCourt(String ccdType) {
        return Arrays.stream(NottinghamCourt.values())
            .filter(option -> option.id.equals(ccdType))
            .findFirst().orElseThrow(IllegalArgumentException::new);
    }
}
