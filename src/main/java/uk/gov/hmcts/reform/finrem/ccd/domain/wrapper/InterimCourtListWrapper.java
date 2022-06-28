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
import uk.gov.hmcts.reform.finrem.ccd.domain.SwanseaCourt;
import uk.gov.hmcts.reform.finrem.ccd.domain.ThamesValleyCourt;

@JsonIgnoreProperties(ignoreUnknown = true)
@Data
@Builder(toBuilder = true)
@AllArgsConstructor
@NoArgsConstructor
@JsonInclude(JsonInclude.Include.NON_NULL)
public class InterimCourtListWrapper implements CourtListWrapper {
    private NottinghamCourt interimNottinghamCourtList;
    private CfcCourt interimCfcCourtList;
    private BirminghamCourt interimBirminghamCourtList;
    private LiverpoolCourt interimLiverpoolCourtList;
    private ManchesterCourt interimManchesterCourtList;
    private LancashireCourt interimLancashireCourtList;
    private CleavelandCourt interimCleavelandCourtList;
    private NwYorkshireCourt interimNwYorkshireCourtList;
    private HumberCourt interimHumberCourtList;
    private KentSurreyCourt interimKentSurreyCourtList;
    private BedfordshireCourt interimBedfordshireCourtList;
    private ThamesValleyCourt interimThamesValleyCourtList;
    private DevonCourt interimDevonCourtList;
    private DorsetCourt interimDorsetCourtList;
    private BristolCourt interimBristolCourtList;
    private NewportCourt interimNewportCourtList;
    private SwanseaCourt interimSwanseaCourtList;
    private NorthWalesCourt interimNorthWalesCourtList;
}
