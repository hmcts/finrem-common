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
import uk.gov.hmcts.reform.finrem.ccd.domain.LondonCourt;
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
public class DefaultRegionWrapper {
    private Region regionList;
    private RegionMidlandsFrc midlandsFrcList;
    private RegionLondonFrc londonFrcList;
    private RegionNorthWestFrc northWestFrcList;
    private RegionNorthEastFrc northEastFrcList;
    private RegionSouthEastFrc southEastFrcList;
    private RegionSouthWestFrc southWestFrcList;
    private RegionWalesFrc walesFrcList;
    private NottinghamCourt nottinghamCourtList;
    private BirminghamCourt birminghamCourtList;
    private LondonCourt londonCourtList;
    private LiverpoolCourt liverpoolCourtList;
    private ManchesterCourt manchesterCourtList;
    private LancashireCourt lancashireCourtList;
    private CfcCourt cfcCourtList;
    private CleavelandCourt cleavelandCourtList;
    private NwYorkshireCourt nwYorkshireCourtList;
    private HumberCourt humberCourtList;
    private KentSurreyCourt kentSurreyCourtList;
    private BedfordshireCourt bedfordshireCourtList;
    private ThamesValleyCourt thamesValleyCourtList;
    private DevonCourt devonCourtList;
    private DorsetCourt dorsetCourtList;
    private BristolCourt bristolCourtList;
    private NewportCourt newportCourtList;
    private SwanseaCourt swanseaCourtList;
    private NorthWalesCourt northWalesCourtList;
}
