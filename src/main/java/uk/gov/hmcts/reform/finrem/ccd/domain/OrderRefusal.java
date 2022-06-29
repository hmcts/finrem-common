package uk.gov.hmcts.reform.finrem.ccd.domain;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

import java.time.LocalDate;
import java.util.List;

@JsonIgnoreProperties(ignoreUnknown = true)
@Data
@Builder
@AllArgsConstructor
public class OrderRefusal {
    private String orderRefusalAfterText;
    private List<OrderRefusalOption> orderRefusal;
    private String orderRefusalOther;
    private Document orderRefusalDocs;
    private JudgeType orderRefusalJudge;
    private String orderRefusalJudgeName;
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd")
    private LocalDate orderRefusalDate;
    private String orderRefusalAddComments;
}
