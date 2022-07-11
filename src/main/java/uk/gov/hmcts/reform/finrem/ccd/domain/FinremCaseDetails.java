package uk.gov.hmcts.reform.finrem.ccd.domain;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.PropertyNamingStrategy;
import com.fasterxml.jackson.databind.annotation.JsonNaming;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import uk.gov.hmcts.reform.ccd.client.model.Classification;

import java.time.LocalDateTime;

@JsonNaming(PropertyNamingStrategy.SnakeCaseStrategy.class)
@JsonIgnoreProperties(ignoreUnknown = true)
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Builder
public class FinremCaseDetails {

    private long id;
    private String jurisdiction;
    private State state;
    private LocalDateTime createdDate;
    private Integer securityLevel;
    private String callbackResponseStatus;
    private LocalDateTime lastModified;
    private Classification securityClassification;
    private FinremCaseData caseData;

    @JsonProperty("caseTypeId")
    private CaseType caseType;

    @JsonProperty("locked_by_user_id")
    private Integer lockedBy;

}
