package uk.gov.hmcts.reform.finrem.ccd.domain.wrapper;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import uk.gov.hmcts.reform.finrem.ccd.domain.BedfordshireCourt;
import uk.gov.hmcts.reform.finrem.ccd.domain.BirminghamCourt;
import uk.gov.hmcts.reform.finrem.ccd.domain.BristolCourt;
import uk.gov.hmcts.reform.finrem.ccd.domain.CfcCourt;
import uk.gov.hmcts.reform.finrem.ccd.domain.CleavelandCourt;
import uk.gov.hmcts.reform.finrem.ccd.domain.DevonCourt;
import uk.gov.hmcts.reform.finrem.ccd.domain.DorsetCourt;
import uk.gov.hmcts.reform.finrem.ccd.domain.HumberCourt;
import uk.gov.hmcts.reform.finrem.ccd.domain.KentSurreyCourt;
import uk.gov.hmcts.reform.finrem.ccd.domain.LancashireCourt;
import uk.gov.hmcts.reform.finrem.ccd.domain.LiverpoolCourt;
import uk.gov.hmcts.reform.finrem.ccd.domain.ManchesterCourt;
import uk.gov.hmcts.reform.finrem.ccd.domain.NewportCourt;
import uk.gov.hmcts.reform.finrem.ccd.domain.NorthWalesCourt;
import uk.gov.hmcts.reform.finrem.ccd.domain.NottinghamCourt;
import uk.gov.hmcts.reform.finrem.ccd.domain.NwYorkshireCourt;
import uk.gov.hmcts.reform.finrem.ccd.domain.Region;
import uk.gov.hmcts.reform.finrem.ccd.domain.RegionLondonFrc;
import uk.gov.hmcts.reform.finrem.ccd.domain.RegionMidlandsFrc;
import uk.gov.hmcts.reform.finrem.ccd.domain.RegionNorthEastFrc;
import uk.gov.hmcts.reform.finrem.ccd.domain.RegionNorthWestFrc;
import uk.gov.hmcts.reform.finrem.ccd.domain.RegionSouthEastFrc;
import uk.gov.hmcts.reform.finrem.ccd.domain.RegionSouthWestFrc;
import uk.gov.hmcts.reform.finrem.ccd.domain.RegionWalesFrc;
import uk.gov.hmcts.reform.finrem.ccd.domain.SwanseaCourt;
import uk.gov.hmcts.reform.finrem.ccd.domain.ThamesValleyCourt;

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
    private NottinghamCourt generalApplicationDirectionsNottinghamCourtList;
    private CfcCourt generalApplicationDirectionsCfcCourtList;
    private BirminghamCourt generalApplicationDirectionsBirminghamCourtList;
    private LiverpoolCourt generalApplicationDirectionsLiverpoolCourtList;
    private ManchesterCourt generalApplicationDirectionsManchesterCourtList;
    private LancashireCourt generalApplicationDirectionsLancashireCourtList;
    private CleavelandCourt generalApplicationDirectionsCleavelandCourtList;
    private NwYorkshireCourt generalApplicationDirectionsNwYorkshireCourtList;
    private HumberCourt generalApplicationDirectionsHumberCourtList;
    private KentSurreyCourt generalApplicationDirectionsKentSurreyCourtList;
    private BedfordshireCourt generalApplicationDirectionsBedfordshireCourtList;
    private ThamesValleyCourt generalApplicationDirectionsThamesValleyCourtList;
    private DevonCourt generalApplicationDirectionsDevonCourtList;
    private DorsetCourt generalApplicationDirectionsDorsetCourtList;
    private BristolCourt generalApplicationDirectionsBristolCourtList;
    private NewportCourt generalApplicationDirectionsNewportCourtList;
    private SwanseaCourt generalApplicationDirectionsSwanseaCourtList;
    private NorthWalesCourt generalApplicationDirectionsNorthWalesCourtList;
}
