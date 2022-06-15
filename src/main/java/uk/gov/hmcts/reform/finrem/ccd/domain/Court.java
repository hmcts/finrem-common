package uk.gov.hmcts.reform.finrem.ccd.domain;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.databind.PropertyNamingStrategy;
import com.fasterxml.jackson.databind.annotation.JsonNaming;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

@JsonNaming(PropertyNamingStrategy.SnakeCaseStrategy.class)
@JsonIgnoreProperties(ignoreUnknown = true)
@Data
@Builder
@AllArgsConstructor
public class Court {
    private Region region;
    private RegionMidlandsFrc midlandsList;
    private RegionLondonFrc londonList;
    private RegionNorthWestFrc northWestList;
    private RegionNorthEastFrc northEastList;
    private RegionSouthEastFrc southEastList;
    private RegionSouthWestFrc southWestList;
    private RegionWalesFrc walesList;
    private NottinghamCourt nottinghamCourtList;
    private CfcCourt cfcCourtList;
    private BirminghamCourt birminghamCourtList;
    private LiverpoolCourt liverpoolCourtList;
    private ManchesterCourt manchesterCourtList;
    private LancashireCourt lancashireCourtList;
    private ClevelandCourt cleavelandCourtList;
    private NwYorkshireCourt nwyorkshireCourtList;
    private HumberCourt humberCourtList;
    private KentSurreyCourt kentSurreyCourtList;
    private BedfordshireCourt bedfordshireCourtList;
    private ThamesValleyCourt thamesvalleyCourtList;
    private DevonCourt devonCourtList;
    private DorsetCourt dorsetCourtList;
    private BristolCourt bristolCourtList;
    private NewportCourt newportCourtList;
    private SwanseaCourt swanseaCourtList;
    private NorthWalesCourt northWalesCourtList;
}
