package uk.gov.hmcts.reform.finrem.ccd.domain;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.databind.PropertyNamingStrategy;
import com.fasterxml.jackson.databind.annotation.JsonNaming;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

import java.time.LocalDate;

@JsonNaming(PropertyNamingStrategy.SnakeCaseStrategy.class)
@JsonIgnoreProperties(ignoreUnknown = true)
@Data
@Builder
@AllArgsConstructor
public class GeneralOrder {

    private String generalOrderAddressTo;
    private String generalOrderOrder;
    private Document generalOrderDocumentUpload;
    private GeneralOrderJudge generalOrderJudgeList;
    private String generalOrderJudgeName;
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd")
    private LocalDate generalOrderDateOfOrder;
    private String generalOrderComments;
}