package uk.gov.hmcts.reform.finrem.ccd.domain;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.databind.PropertyNamingStrategy;
import com.fasterxml.jackson.databind.annotation.JsonNaming;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@JsonNaming(PropertyNamingStrategy.SnakeCaseStrategy.class)
@JsonIgnoreProperties(ignoreUnknown = true)
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class ContestedUploadOrder {
    private UploadOrderDocumentType documentType;
    private Document documentLink;
    private String documentEmailContent;
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd")
    private LocalDate documentDateAdded;
    private String documentComment;
    private String documentFileName;
}
