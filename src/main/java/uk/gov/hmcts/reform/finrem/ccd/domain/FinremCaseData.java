package uk.gov.hmcts.reform.finrem.ccd.domain;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.PropertyNamingStrategy;
import com.fasterxml.jackson.databind.annotation.JsonNaming;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.List;

import static com.fasterxml.jackson.annotation.JsonProperty.Access.WRITE_ONLY;

@JsonNaming(PropertyNamingStrategy.SnakeCaseStrategy.class)
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class FinremCaseData {

    @JsonProperty(access = WRITE_ONLY)
    private String ccdCaseId;

    private String isAdmin;
    private YesOrNo applicantRepresented;
    private Address applicantAddress;
    private String applicantPhone;
    private String applicantEmail;
    private YesOrNo applicantAddressConfidential;
    private String solicitorName;
    private String solicitorFirm;
    private String solicitorReference;
    private Address solicitorAddress;
    private String solicitorPhone;
    private String solicitorEmail;
    private String solicitorDxNumber;
    private YesOrNo solicitorAgreeToReceiveEmails;
    private String divorceCaseNumber;
    private StageReached divorceStageReached;
    private Document divorceUploadEvidence1;
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd")
    private LocalDate divorceDecreeNisiDate;
    private Document divorceUploadEvidence2;
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd")
    private LocalDate divorceDecreeAbsoluteDate;
    private String applicantFMName;
    private String applicantLName;
    private String appRespondentFMName;
    private String appRespondentLName;
    private YesOrNo appRespondentRep;
    private String rSolicitorName;
    private String rSolicitorFirm;
    private String rSolicitorReference;
    private Address rSolicitorAddress;
    private String rSolicitorPhone;
    private String rSolicitorEmail;
    private String rSolicitorDXnumber;
    private Address respondentAddress;
    private String respondentPhone;
    private String respondentEmail;
    private YesOrNo respondentAddressConfidential;
    private Provision provisionMadeFor;
    private Intention applicantIntendsTo;
    private List<PeriodicalPaymentSubstitute> dischargePeriodicalPaymentSubstituteFor;
    private YesOrNo applyingForConsentOrder;
    private List<NatureApplication> natureOfApplication2;
    private String natureOfApplication3a;
    private String natureOfApplication3b;
    private YesOrNo orderForChildrenQuestion1;
    private YesOrNo natureOfApplication5;
    private NatureApplication5b natureOfApplication5b;
    private List<ChildrenOrder> natureOfApplication6;
    private String natureOfApplication7;
    private YesOrNo childSupportAgencyCalculationMade;
    private String childSupportAgencyCalculationReason;
    private String authorisationName;
    private String authorisationFirm;
    private String authorisation2b;
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd")
    private LocalDate authorisation3;
    private Document miniFormA;
    private Document consentOrder;
    private Document consentOrderText;
    private Document latestConsentOrder;
    private YesOrNo d81Question;
    private Document d81Joint;
    private Document d81Applicant;
    private Document d81Respondent;
    private List<PensionTypeCollection> pensionCollection;
    private List<PaymentDocumentCollection> copyOfPaperFormA;
    @JsonProperty("otherCollection")
    private List<OtherDocumentCollection> otherDocuments;
    private List<GeneralLetterCollection> generalLetterCollection;
    private YesOrNo helpWithFeesQuestion;
    private String HWFNumber;
    @JsonFormat(shape = JsonFormat.Shape.STRING)
    private BigDecimal amountToPay;
    private String pbaNumber;
    private String pbaReference;
    private String pbaPaymentReference;
    private OrderDirection orderDirection;
    private Document orderDirectionOpt1;
    private String orderDirectionOpt2;
    private YesOrNo orderDirectionAbsolute;
    private YesOrNo servePensionProvider;
    private PensionProvider servePensionProviderResponsibility;
    private String servePensionProviderOther;
    private OrderDirectionJudge orderDirectionJudge;
    private String orderDirectionJudgeName;
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd")
    private LocalDate orderDirectionDate;
    private String orderDirectionAddComments;
    private List<OrderRefusalCollection> orderRefusalCollection;
    private List<OrderRefusalCollection> orderRefusalCollectionNew;
    private Document orderRefusalPreviewDocument;
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd")
    private LocalDate dueDate;
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd")
    private LocalDate issueDate;
    private AssignToJudgeReason assignedToJudgeReason;
    //TODO: This should be a dynamic list type populated on the aboutToStart event but currently it is generated in Jenkins for finrem-ccd-definitions
    private String assignedToJudge;
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd")
    private LocalDate referToJudgeDate;
    private String referToJudgeText;
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd")
    private LocalDate referToJudgeDateFromOrderMade;
    private String referToJudgeTextFromOrderMade;
}
