package uk.gov.hmcts.reform.finrem.ccd.domain.wrapper;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import uk.gov.hmcts.reform.finrem.ccd.domain.Address;
import uk.gov.hmcts.reform.finrem.ccd.domain.NoticeOfChangeParty;
import uk.gov.hmcts.reform.finrem.ccd.domain.YesOrNo;

@JsonIgnoreProperties(ignoreUnknown = true)
@Data
@Builder(toBuilder = true)
@AllArgsConstructor
@NoArgsConstructor
@JsonInclude(JsonInclude.Include.NON_NULL)
public class ContactDetailsWrapper {
    private YesOrNo updateIncludesRepresentativeChange;
    private NoticeOfChangeParty nocParty;
    private YesOrNo applicantRepresented;
    private String applicantSolicitorName;
    private String applicantSolicitorFirm;
    private String solicitorReference;
    private Address applicantSolicitorAddress;
    private String applicantSolicitorPhone;
    private String applicantSolicitorEmail;
    @JsonProperty("applicantSolicitorDXnumber")
    private String applicantSolicitorDxNumber;
    private YesOrNo applicantSolicitorConsentForEmails;
    @JsonProperty("applicantFMName")
    private String applicantFmName;
    @JsonProperty("applicantLName")
    private String applicantLname;
    private Address applicantAddress;
    private String applicantPhone;
    private String applicantEmail;
    private YesOrNo applicantAddressConfidential;
    @JsonProperty("respondentFMName")
    private String respondentFmName;
    @JsonProperty("respondentLName")
    private String respondentLname;
    private YesOrNo respondentRepresented;
    @JsonProperty("rSolicitorName")
    private String respondentSolicitorName;
    @JsonProperty("rSolicitorFirm")
    private String respondentSolicitorFirm;
    @JsonProperty("rSolicitorReference")
    private String respondentSolicitorReference;
    @JsonProperty("rSolicitorAddress")
    private Address respondentSolicitorAddress;
    @JsonProperty("rSolicitorPhone")
    private String respondentSolicitorPhone;
    @JsonProperty("rSolicitorEmail")
    private String respondentSolicitorEmail;
    @JsonProperty("rSolicitorDXnumber")
    private String respondentSolicitorDxNumber;
    private Address respondentAddress;
    private String respondentPhone;
    private String respondentEmail;
    private YesOrNo respondentAddressConfidential;
    private String solicitorName;
    private String solicitorFirm;
    private Address solicitorAddress;
    private String solicitorPhone;
    private String solicitorEmail;
    @JsonProperty("solicitorDXnumber")
    private String solicitorDxNumber;
    private YesOrNo solicitorAgreeToReceiveEmails;
    @JsonProperty("appRespondentFMName")
    private String appRespondentFmName;
    private String appRespondentLName;
    private YesOrNo appRespondentRep;
    private String isAdmin;
}
