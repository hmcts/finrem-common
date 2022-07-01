package uk.gov.hmcts.reform.finrem.ccd.domain;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@JsonIgnoreProperties(ignoreUnknown = true)
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class DirectionDetail {
    private YesOrNo isAnotherHearingYN;
    private String timeEstimate;
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd")
    private LocalDate dateOfHearing;
    private String hearingTime;
    private Court localCourt;
    private NottinghamCourt nottinghamList;
    private CfcCourt cfcList;
    private HearingTypeDirection typeOfHearing;
}
