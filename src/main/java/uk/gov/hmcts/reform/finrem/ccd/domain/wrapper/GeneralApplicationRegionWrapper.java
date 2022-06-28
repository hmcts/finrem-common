package uk.gov.hmcts.reform.finrem.ccd.domain.wrapper;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonUnwrapped;
import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import uk.gov.hmcts.reform.finrem.ccd.domain.Region;
import uk.gov.hmcts.reform.finrem.ccd.domain.RegionLondonFrc;
import uk.gov.hmcts.reform.finrem.ccd.domain.RegionMidlandsFrc;
import uk.gov.hmcts.reform.finrem.ccd.domain.RegionNorthEastFrc;
import uk.gov.hmcts.reform.finrem.ccd.domain.RegionNorthWestFrc;
import uk.gov.hmcts.reform.finrem.ccd.domain.RegionSouthEastFrc;
import uk.gov.hmcts.reform.finrem.ccd.domain.RegionSouthWestFrc;
import uk.gov.hmcts.reform.finrem.ccd.domain.RegionWalesFrc;

@JsonIgnoreProperties(ignoreUnknown = true)
@Data
@Builder(toBuilder = true)
@AllArgsConstructor
@NoArgsConstructor
@JsonInclude(JsonInclude.Include.NON_NULL)
public class GeneralApplicationRegionWrapper {
    private Region generalApplicationDirectionsRegionList;
    private RegionMidlandsFrc generalApplicationDirectionsMidlandsFrcList;
    private RegionLondonFrc generalApplicationDirectionsLondonFrcList;
    private RegionNorthWestFrc generalApplicationDirectionsNorthWestFrcList;
    private RegionNorthEastFrc generalApplicationDirectionsNorthEastFrcList;
    private RegionSouthEastFrc generalApplicationDirectionsSouthEastFrcList;
    private RegionSouthWestFrc generalApplicationDirectionsSouthWestFrcList;
    private RegionWalesFrc generalApplicationDirectionsWalesFrcList;
    @JsonUnwrapped
    @Getter(AccessLevel.NONE)
    GeneralApplicationCourtListWrapper courtListWrapper;

    @JsonIgnore
    public GeneralApplicationCourtListWrapper getCourtListWrapper() {
        if (courtListWrapper == null) {
            this.courtListWrapper = new GeneralApplicationCourtListWrapper();
        }
        return courtListWrapper;
    }
}
