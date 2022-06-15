package uk.gov.hmcts.reform.finrem.ccd.domain.wrapper;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import uk.gov.hmcts.reform.finrem.ccd.domain.MiamDomesticViolence;
import uk.gov.hmcts.reform.finrem.ccd.domain.MiamExemption;
import uk.gov.hmcts.reform.finrem.ccd.domain.MiamOtherGrounds;
import uk.gov.hmcts.reform.finrem.ccd.domain.MiamPreviousAttendance;
import uk.gov.hmcts.reform.finrem.ccd.domain.MiamUrgencyReason;
import uk.gov.hmcts.reform.finrem.ccd.domain.YesOrNo;

import java.util.List;

@JsonIgnoreProperties(ignoreUnknown = true)
@Data
@Builder(toBuilder = true)
@AllArgsConstructor
@NoArgsConstructor
@JsonInclude(JsonInclude.Include.NON_NULL)
public class MiamWrapper {
    private YesOrNo applicantAttendedMiam;
    private YesOrNo claimingExemptionMiam;
    private YesOrNo familyMediatorMiam;
    private List<MiamExemption> miamExemptionsChecklist;
    private List<MiamDomesticViolence> miamDomesticViolenceChecklist;
    private List<MiamUrgencyReason> miamUrgencyReasonChecklist;
    private MiamPreviousAttendance miamPreviousAttendanceChecklist;
    private MiamOtherGrounds miamOtherGroundsChecklist;
}
