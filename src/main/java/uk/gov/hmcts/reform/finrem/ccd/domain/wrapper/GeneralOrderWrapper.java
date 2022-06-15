package uk.gov.hmcts.reform.finrem.ccd.domain.wrapper;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import uk.gov.hmcts.reform.finrem.ccd.domain.ContestedGeneralOrderCollection;
import uk.gov.hmcts.reform.finrem.ccd.domain.Document;
import uk.gov.hmcts.reform.finrem.ccd.domain.GeneralOrderAddressTo;
import uk.gov.hmcts.reform.finrem.ccd.domain.GeneralOrderCollection;
import uk.gov.hmcts.reform.finrem.ccd.domain.GeneralOrderJudgeType;

import java.time.LocalDate;
import java.util.List;

@JsonIgnoreProperties(ignoreUnknown = true)
@Data
@Builder(toBuilder = true)
@AllArgsConstructor
@NoArgsConstructor
@JsonInclude(JsonInclude.Include.NON_NULL)
public class GeneralOrderWrapper {
    private GeneralOrderAddressTo generalOrderAddressTo;
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd")
    private LocalDate generalOrderDate;
    private String generalOrderCreatedBy;
    private String generalOrderBodyText;
    private GeneralOrderJudgeType generalOrderJudgeType;
    private String generalOrderRecitals;
    private String generalOrderJudgeName;
    private Document generalOrderLatestDocument;
    private List<ContestedGeneralOrderCollection> generalOrders;
    private List<ContestedGeneralOrderCollection> generalOrdersConsent;
    private List<GeneralOrderCollection> generalOrderCollection;
}
