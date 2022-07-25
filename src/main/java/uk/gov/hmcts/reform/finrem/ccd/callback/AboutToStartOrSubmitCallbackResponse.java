package uk.gov.hmcts.reform.finrem.ccd.callback;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import uk.gov.hmcts.reform.finrem.ccd.domain.FinremCaseData;

import java.util.List;
import java.util.Map;

@JsonIgnoreProperties(ignoreUnknown = true)
@Data
@Builder(toBuilder = true)
@AllArgsConstructor
@NoArgsConstructor
public class AboutToStartOrSubmitCallbackResponse {
    FinremCaseData data;

    @JsonProperty("data_classification")
    private Map<String, Object> dataClassification;

    @JsonProperty("security_classification")
    private Map<String, Object> securityClassification;

    private List<String> errors;

    private List<String> warnings;

    private String  state;
}
