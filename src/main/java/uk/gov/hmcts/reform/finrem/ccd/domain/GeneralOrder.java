package uk.gov.hmcts.reform.finrem.ccd.domain;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
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
public class GeneralOrder {
    @JsonProperty("generalOrder_addressTo")
    private String generalOrderAddressTo;
    @JsonProperty("generalOrder_order")
    private String generalOrderOrder;
    @JsonProperty("generalOrder_documentUpload")
    private Document generalOrderDocumentUpload;
    @JsonProperty("generalOrder_judgeList")
    private JudgeType generalOrderJudgeType;
    @JsonProperty("generalOrder_judgeName")
    private String generalOrderJudgeName;
    @JsonProperty("generalOrder_dateOfOrder")
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd")
    private LocalDate generalOrderDateOfOrder;
    @JsonProperty("generalOrder_comments")
    private String generalOrderComments;
    private String generalOrderText;
}
