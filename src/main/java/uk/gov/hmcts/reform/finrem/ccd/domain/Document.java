package uk.gov.hmcts.reform.finrem.ccd.domain;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

@JsonIgnoreProperties(ignoreUnknown = true)
@Data
@Builder
@AllArgsConstructor
public class Document {

    @JsonProperty("document_url")
    private String url;
    @JsonProperty("document_binary_url")
    private String binaryUrl;
    @JsonProperty("document_filename")
    private String filename;
}
