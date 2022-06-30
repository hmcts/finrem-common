package uk.gov.hmcts.reform.finrem.ccd.domain.wrapper;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import uk.gov.hmcts.reform.finrem.ccd.domain.BedfordshireCourt;
import uk.gov.hmcts.reform.finrem.ccd.domain.BirminghamCourt;
import uk.gov.hmcts.reform.finrem.ccd.domain.BristolCourt;
import uk.gov.hmcts.reform.finrem.ccd.domain.CfcCourt;
import uk.gov.hmcts.reform.finrem.ccd.domain.ClevelandCourt;
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
import uk.gov.hmcts.reform.finrem.ccd.domain.SwanseaCourt;
import uk.gov.hmcts.reform.finrem.ccd.domain.ThamesValleyCourt;

@JsonIgnoreProperties(ignoreUnknown = true)
@Data
@Builder(toBuilder = true)
@AllArgsConstructor
@NoArgsConstructor
@JsonInclude(JsonInclude.Include.NON_NULL)
public class GeneralApplicationCourtListWrapper implements CourtListWrapper {
    @JsonProperty("generalApplicationDirections_nottinghamCourtList")
    private NottinghamCourt generalApplicationDirectionsNottinghamCourtList;
    @JsonProperty("generalApplicationDirections_cfcCourtList")
    private CfcCourt generalApplicationDirectionsCfcCourtList;
    @JsonProperty("generalApplicationDirections_birminghamCourtList")
    private BirminghamCourt generalApplicationDirectionsBirminghamCourtList;
    @JsonProperty("generalApplicationDirections_liverpoolCourtList")
    private LiverpoolCourt generalApplicationDirectionsLiverpoolCourtList;
    @JsonProperty("generalApplicationDirections_manchesterCourtList")
    private ManchesterCourt generalApplicationDirectionsManchesterCourtList;
    @JsonProperty("generalApplicationDirections_lancashireCourtList")
    private LancashireCourt generalApplicationDirectionsLancashireCourtList;
    @JsonProperty("generalApplicationDirections_cleavelandCourtList")
    private ClevelandCourt generalApplicationDirectionsClevelandCourtList;
    @JsonProperty("generalApplicationDirections_nwyorkshireCourtList")
    private NwYorkshireCourt generalApplicationDirectionsNwYorkshireCourtList;
    @JsonProperty("generalApplicationDirections_humberCourtList")
    private HumberCourt generalApplicationDirectionsHumberCourtList;
    @JsonProperty("generalApplicationDirections_kentSurreyCourtList")
    private KentSurreyCourt generalApplicationDirectionsKentSurreyCourtList;
    @JsonProperty("generalApplicationDirections_bedfordshireCourtList")
    private BedfordshireCourt generalApplicationDirectionsBedfordshireCourtList;
    @JsonProperty("generalApplicationDirections_thamesvalleyCourtList")
    private ThamesValleyCourt generalApplicationDirectionsThamesValleyCourtList;
    @JsonProperty("generalApplicationDirections_devonCourtList")
    private DevonCourt generalApplicationDirectionsDevonCourtList;
    @JsonProperty("generalApplicationDirections_dorsetCourtList")
    private DorsetCourt generalApplicationDirectionsDorsetCourtList;
    @JsonProperty("generalApplicationDirections_bristolCourtList")
    private BristolCourt generalApplicationDirectionsBristolCourtList;
    @JsonProperty("generalApplicationDirections_newportCourtList")
    private NewportCourt generalApplicationDirectionsNewportCourtList;
    @JsonProperty("generalApplicationDirections_swanseaCourtList")
    private SwanseaCourt generalApplicationDirectionsSwanseaCourtList;
    @JsonProperty("generalApplicationDirections_northWalesCourtList")
    private NorthWalesCourt generalApplicationDirectionsNorthWalesCourtList;
}
