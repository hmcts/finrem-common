package uk.gov.hmcts.reform.finrem.ccd.domain;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@JsonIgnoreProperties(ignoreUnknown = true)
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class UploadCaseDocument {
    private Document caseDocuments;
    private CaseDocumentType caseDocumentType;
    private CaseDocumentParty caseDocumentParty;
    private String caseDocumentOther;
    private YesOrNo caseDocumentConfidential;
    private String hearingDetails;
}
