package uk.gov.hmcts.reform.finrem.ccd.domain;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.PropertyNamingStrategy;
import com.fasterxml.jackson.databind.annotation.JsonNaming;
import lombok.AllArgsConstructor;
import lombok.Getter;
import uk.gov.hmcts.reform.ccd.client.model.Classification;

import java.time.LocalDateTime;

@JsonNaming(PropertyNamingStrategy.SnakeCaseStrategy.class)
@JsonIgnoreProperties(ignoreUnknown = true)
@AllArgsConstructor
@Getter
public class FinremCaseDetails {

    private long id;
    private String jurisdiction;
    private State state;
    private LocalDateTime createdDate;
    private String caseTypeId;
    private FinremCaseData caseData;
    private Integer securityLevel;
    private Classification securityClassification;
    private String callbackResponseStatus;
    private LocalDateTime lastModified;

    @JsonProperty("locked_by_user_id")
    private Integer lockedBy;

}
