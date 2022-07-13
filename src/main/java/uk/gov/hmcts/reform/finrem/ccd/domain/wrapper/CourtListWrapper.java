package uk.gov.hmcts.reform.finrem.ccd.domain.wrapper;

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

public interface CourtListWrapper {
    NottinghamCourt getNottinghamCourt();

    CfcCourt getCfcCourt();

    BirminghamCourt getBirminghamCourt();

    LiverpoolCourt getLiverpoolCourt();

    ManchesterCourt getManchesterCourt();

    LancashireCourt getLancashireCourt();

    ClevelandCourt getClevelandCourt(boolean isConsented);

    NwYorkshireCourt getNwYorkshireCourt();

    HumberCourt getHumberCourt();

    KentSurreyCourt getKentSurreyCourt();

    BedfordshireCourt getBedfordshireCourt();

    ThamesValleyCourt getThamesValleyCourt();

    DevonCourt getDevonCourt();

    DorsetCourt getDorsetCourt();

    BristolCourt getBristolCourt();

    NewportCourt getNewportCourt();

    SwanseaCourt getSwanseaCourt();

    NorthWalesCourt getNorthWalesCourt();

}
