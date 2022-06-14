package uk.gov.hmcts.reform.finrem.ccd.domain;

import javax.print.Doc;

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
    private List<OtherDocumentCollection> otherDocumentsCollection;
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
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd")
    private LocalDate referToJudgeDateFromConsOrdApproved;
    private String referToJudgeTextFromConsOrdApproved;
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd")
    private LocalDate referToJudgeDateFromConsOrdMade;
    private String referToJudgeTextFromConsOrdMade;
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd")
    private LocalDate referToJudgeDateFromClose;
    private String referToJudgeTextFromClose;
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd")
    private LocalDate referToJudgeDateFromAwaitingResponse;
    private String referToJudgeTextFromAwaitingResponse;
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd")
    private LocalDate referToJudgeDateFromRespondToOrder;
    private String referToJudgeTextFromRespondToOrder;
    private List<UploadConsentOrderDocumentCollection> uploadConsentOrderDocuments;
    private List<UploadOrderCollection> uploadOrder;
    private List<UploadDocumentCollection> uploadDocuments;
    private List<SolUploadDocumentCollection> solUploadDocuments;
    private List<GeneralOrderCollection> generalOrderCollection;
    private List<RespondToOrderDocumentCollection> respondToOrderDocuments;
    private List<AmendedConsentOrderCollection> amendedConsentOrderCollection;
    private List<CaseNotesCollection> caseNotesCollection;
    private String state;
    private List<ScannedDocumentCollection> scannedDocuments;
    private YesOrNo evidenceHandled;
    private GeneralLetterAddressToType generalLetterAddressTo;
    private String generalLetterRecipient;
    private Address generalLetterRecipientAddress;
    private String generalLetterCreatedBy;
    private String generalLetterBody;
    private Document approvedConsentOrderLetter;
    private Document bulkPrintCoverSheetRes;
    private String bulkPrintLetterIdRes;
    private Document bulkPrintCoverSheetApp;
    private String bulkPrintLetterIdApp;
    private List<ApprovedOrderCollection> approvedOrderCollection;
    private Region regionList;
    private RegionMidlandsFrc midlandsFrcList;
    private RegionLondonFrc londonFRCList;
    private RegionNorthWestFrc northWestFrcList;
    private RegionNorthEastFrc northEastFrcList;
    private RegionSouthEastFrc southEastFrcList;
    private RegionSouthWestFrc southWestFrcList;
    private RegionWalesFrc walesFRCList;
    private NottinghamCourt nottinghamCourtList;
    private BirminghamCourt birminghamCourtList;
    private LondonCourt londonCourtList;
    private LiverpoolCourt liverpoolCourtList;
    private ManchesterCourt manchesterCourtList;
    private LancashireCourt lancashireCourtList;
    private ClevelandCourt clevelandCourtList;
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
    private ApplicantRole divRoleOfFrApplicant;
    private ApplicantRepresentedPaper applicantRepresentedPaper;
    private String authorisationSolicitorAddress;
    private YesOrNo authorisationSigned;
    private AuthorisationSignedBy authorisationSignedBy;
    private String bulkScanCaseReference;
    private List<ChildrenInfoCollection> childrenInfo;
    private Document formA;
    private List<DocumentCollection> scannedD81s;
    private String generalEmailRecipient;
    private String generalEmailCreatedBy;
    private String generalEmailBody;
    private List<GeneralEmailCollection> generalEmailCollection;
    private GeneralOrderAddressTo generalOrderAddressTo;
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd")
    private LocalDate generalOrderDate;
    private String generalOrderCreatedBy;
    private String generalOrderBodyText;
    private GeneralOrderJudgeType generalOrderJudgeType;
    private String generalOrderRecitals;
    private String generalOrderJudgeName;
    private Document generalOrderLatestDocument;
    private String transferLocalCourtName;
    private String transferLocalCourtEmail;
    private String transferLocalCourtInstructions;
    private List<TransferCourtEmailCollection> transferLocalCourtEmailCollection;
    private YesOrNo civilPartnership;
    private List<RepresentationUpdateHistoryCollection> representationUpdateHistory;
    private NoticeOfChangeParty nocParty;
    private YesOrNo updateIncludesRepresentativeChange;
    private Document generalLetterPreview;
    private YesOrNo paperApplication;
    private Document bulkPrintCoverSheetAppConfidential;
    private Document bulkPrintCoverSheetResConfidential;
    private YesOrNo respSolNotificationsEmailConsent;
    private String applicantSolicitorName;
    private String applicantSolicitorFirm;
    private Address applicantSolicitorAddress;
    private String applicantSolicitorPhone;
    private String applicantSolicitorEmail;
    private String applicantSolicitorDXnumber;
    private YesOrNo applicantSolicitorConsentForEmails;
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd")
    private LocalDate dateOfMarriage;
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd")
    private LocalDate dateOfSepration;
    private String nameOfCourtDivorceCentre;
    private Document divorceUploadPetition;
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd")
    private LocalDate divorcePetitionIssuedDate;
    private String respondentLName;
    private YesOrNo respondentRepresented;
    private List<NatureApplication> natureOfApplicationChecklist;
    private String propertyAddress;
    private String mortgageDetail;
    private YesOrNo additionalPropertyOrderDecision;
    @JsonProperty("propertyAdjutmentOrderDetail")
    private List<PropertyAdjustmentOrderCollection> propertyAdjustmentOrderDetail;
    private YesOrNo paymentForChildrenDecision;
    private YesOrNo benefitForChildrenDecision;
    private List<BenefitPayment> benefitPaymentChecklist;
    private YesOrNo fastTrackDecision;
    private List<FastTrackReason> fastTrackDecisionReason;
    private Complexity addToComplexityListOfCourts;
    private List<EstimatedAsset> estimatedAssetsChecklist;
    private String netValueOfHome;
    private List<PotentialAllegation> potentialAllegationChecklist;
    private String detailPotentialAllegation;
    private YesOrNo otherReasonForComplexity;
    private String otherReasonForComplexityText;
    private String specialAssistanceRequired;
    private String specificArrangementsRequired;
    private YesOrNo isApplicantsHomeCourt;
    private String reasonForLocalCourt;
    private YesOrNo applicantAttendedMiam;
    private YesOrNo claimingExemptionMiam;
    private YesOrNo familyMediatorMiam;
    private List<MiamExemption> miamExemptionsChecklist;
    private List<MiamDomesticViolence> miamDomesticViolenceChecklist;
    private List<MiamUrgencyReason> miamUrgencyReasonChecklist;
    private MiamPreviousAttendance miamPreviousAttendanceChecklist;
    private MiamOtherGrounds miamOtherGroundsChecklist;
    private String mediatorRegistrationNumber;
    private String familyMediatorServiceName;
    private String soleTraderName;
    private String mediatorRegistrationNumber1;
    private String familyMediatorServiceName1;
    private String soleTraderName1;
    private YesOrNo promptForAnyDocument;
    private List<UploadAdditionalDocumentCollection> uploadAdditionalDocument;
    private List<AdditionalHearingDocumentCollection> additionalHearingDocuments;
    private HearingTypeDirection hearingType;
    private String timeEstimate;
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd")
    private LocalDate hearingDate;
    private String additionalInformationAboutHearing;
    private String hearingTime;
    private List<JudgeAllocated> judgeAllocated;
    private YesOrNo applicationAllocatedTo;
    private YesOrNo caseAllocatedTo;
    private JudgeTimeEstimate judgeTimeEstimate;
    private String judgeTimeEstimateTextArea;
    private Document formC;
    private Document formG;
    private List<UploadCaseDocumentCollection> uploadCaseDocument;
    private List<UploadGeneralDocumentCollection> uploadGeneralDocuments;
    private List<UploadConsentOrderCollection> uploadConsentOrder;
    private Document uploadConsentedOrder;
    private AssignToJudgeReason assignToJudgeReason;
    private String assignToJudgeText;
    private YesOrNo subjectToDecreeAbsoluteValue;
    private String selectJudge;
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd")
    private LocalDate dateOfOrder;
    private String additionalComments;
    private List<ContestedGeneralOrderCollection> generalOrders;
    private List<ContestedGeneralOrderCollection> generalOrdersConsent;
    private List<ApplicationNotApprovedCollection> applicationNotApproved;
    private String attendingCourtWithAssistance;
    private String attendingCourtWithArrangement;
    private SolicitorToDraftOrder solicitorResponsibleForDraftingOrder;
    private List<DraftDirectionOrderCollection> draftDirectionOrderCollection;
    private DraftDirectionOrder latestDraftDirectionOrder;
    private List<DraftDirectionOrderCollection> judgesAmendedOrderCollection;
    private List<DraftDirectionDetailsCollection> draftDirectionDetailsCollection;
    private List<DraftDirectionDetailsCollection> draftDirectionDetailsCollectionRO;
    private List<DirectionOrderCollection> uploadHearingOrder;
    private List<DocumentCollection> hearingOrderOtherDocuments;
    private List<DirectionDetailCollection> directionDetailsCollection;
    private RefusalOrderJudgeType refusalOrderJudgeType;
    private String refusalOrderJudgeName;
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd")
    private LocalDate refusalOrderDate;
    private Document refusalOrderPreviewDocument;
    private Document latestRefusalOrder;
    private Document refusalOrderAdditionalDocument;
    private String hiddenTabValue;
    private ClevelandCourt  cleavelandCourtList;
    private String consentNatureOfApplicationAddress;
    private String consentNatureOfApplicationMortgage;
    private YesOrNo consentOrderForChildrenQuestion1;
    private YesOrNo consentNatureOfApplication5;
    private String consentNatureOfApplication7;
    private YesOrNo consentD81Question;
    private Document consentD81Joint;
    private Document consentD81Applicant;
    private Document consentD81Respondent;
    private String consentOrderFRCName;
    private Address consentOrderFRCAddress;
    private String consentOrderFRCEmail;
    private String consentOrderFRCPhone;
    private YesOrNo consentSubjectToDecreeAbsoluteValue;
    private YesOrNo consentServePensionProvider;
    private String consentServePensionProviderOther;
    private String consentSelectJudge;
    private String consentJudgeName;
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd")
    private LocalDate consentDateOfOrder;
    private String consentAdditionalComments;
    private Document consentMiniFormA;
    private String generalApplicationCreatedBy;
    private YesOrNo generalApplicationHearingRequired;
    private String generalApplicationTimeEstimate;
    private String generalApplicationSpecialMeasures;
    private Document generalApplicationDocument;
    private Document generalApplicationLatestDocument;
    private Document generalApplicationDraftOrder;
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd")
    private LocalDate generalApplicationLatestDocumentDate;
    private String generalApplicationPreState;
    private String generalApplicationReferToJudgeEmail;
    private String generalApplicationOutcomeOther;
    private YesOrNo generalApplicationDirectionsHearingRequired;
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd")
    private LocalDate generalApplicationDirectionsHearingDate;
    private String generalApplicationDirectionsHearingTime;
    private String generalApplicationDirectionsHearingTimeEstimate;
    private String generalApplicationDirectionsAdditionalInformation;
    private String generalApplicationDirectionsRecitals;
    private String generalApplicationDirectionsJudgeName;
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd")
    private LocalDate generalApplicationDirectionsCourtOrderDate;
    private String generalApplicationDirectionsTextFromJudge;
    private Document generalApplicationDirectionsDocument;
    private String generalApplicationNotApprovedReason;
    private Document latestDraftHearingOrder;
    private String orderApprovedJudgeName;
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd")
    private LocalDate orderApprovedDate;
    private Document orderApprovedCoverLetter;
    private String hearingDetails;
    private List<UploadAdditionalDocumentCollection> appHearingBundlesCollection;
    private List<UploadAdditionalDocumentCollection> appFormEExhibitsCollection;
    private List<UploadAdditionalDocumentCollection> appChronologiesCollection;
    private List<UploadAdditionalDocumentCollection> appQACollection;
    private List<UploadAdditionalDocumentCollection> appStatementsExhibitsCollection;
    private List<UploadAdditionalDocumentCollection> appCaseSummariesCollection;
    private List<UploadAdditionalDocumentCollection> appFormsHCollection;
    private List<UploadAdditionalDocumentCollection> appExpertEvidenceCollection;
    private List<UploadAdditionalDocumentCollection> appCorrespondenceDocsCollection;
    private List<UploadAdditionalDocumentCollection> appOtherCollection;
    private List<UploadAdditionalDocumentCollection> respHearingBundlesCollection;
    private List<UploadAdditionalDocumentCollection> respFormEExhibitsCollection;
    private List<UploadAdditionalDocumentCollection> respChronologiesCollection;
    private List<UploadAdditionalDocumentCollection> respQACollection;
    private List<UploadAdditionalDocumentCollection> respStatementsExhibitsCollection;
    private List<UploadAdditionalDocumentCollection> respCaseSummariesCollection;
    private List<UploadAdditionalDocumentCollection> respFormsHCollection;
    private List<UploadAdditionalDocumentCollection> respExpertEvidenceCollection;
    private List<UploadAdditionalDocumentCollection> respCorrespondenceDocsColl;
    private List<UploadAdditionalDocumentCollection> respOtherCollection;
    private YesOrNo applicantShareDocs;
    private YesOrNo respondentShareDocs;
    private List<UploadAdditionalDocumentCollection> appHearingBundlesCollectionShared;
    private List<UploadAdditionalDocumentCollection> appFormEExhibitsCollectionShared;
    private List<UploadAdditionalDocumentCollection> appChronologiesCollectionShared;
    private List<UploadAdditionalDocumentCollection> appQACollectionShared;
    private List<UploadAdditionalDocumentCollection> appStatementsExhibitsCollShared;
    private List<UploadAdditionalDocumentCollection> appCaseSummariesCollectionShared;
    private List<UploadAdditionalDocumentCollection> appFormsHCollectionShared;
    private List<UploadAdditionalDocumentCollection> appExpertEvidenceCollectionShared;
    private List<UploadAdditionalDocumentCollection> appCorrespondenceDocsCollShared;
    private List<UploadAdditionalDocumentCollection> appOtherCollectionShared;
    private List<UploadAdditionalDocumentCollection> respHearingBundlesCollShared;
    private List<UploadAdditionalDocumentCollection> respFormEExhibitsCollectionShared;
    private List<UploadAdditionalDocumentCollection> respChronologiesCollectionShared;
    private List<UploadAdditionalDocumentCollection> respQACollectionShared;
    private List<UploadAdditionalDocumentCollection> respStatementsExhibitsCollShared;
    private List<UploadAdditionalDocumentCollection> respCaseSummariesCollectionShared;
    private List<UploadAdditionalDocumentCollection> respFormsHCollectionShared;
    private List<UploadAdditionalDocumentCollection> respExpertEvidenceCollShared;
    private List<UploadAdditionalDocumentCollection> respCorrespondenceDocsCollShared;
    private List<UploadAdditionalDocumentCollection> respOtherCollectionShared;
    private String reasonForFRCLocation;
    private String interimTimeEstimate;
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd")
    private LocalDate interimHearingDate;
    private String interimHearingTime;
    private String interimAdditionalInformationAboutHearing;
    private YesOrNo interimPromptForAnyDocument;
    private Document interimUploadAdditionalDocument;
    private Document interimHearingDirectionsDocument;
    private List<HearingUploadBundleCollection> hearingUploadBundle;
    private SendOrderEventPostStateOption sendOrderPostStateOption;
}
