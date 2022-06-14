package uk.gov.hmcts.reform.finrem.ccd.domain;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

@JsonIgnoreProperties(ignoreUnknown = true)
@Data
@Builder
@AllArgsConstructor
public class UploadCaseDocument {
    private Document caseDocuments;
    private CaseDocumentType caseDocumentType;
    private CaseDocumentParty caseDocumentParty;
    private String caseDocumentOther;
    private YesOrNo caseDocumentConfidential;
    private String hearingDetails;
}
