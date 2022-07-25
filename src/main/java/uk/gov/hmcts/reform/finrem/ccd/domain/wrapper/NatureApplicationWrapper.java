package uk.gov.hmcts.reform.finrem.ccd.domain.wrapper;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import uk.gov.hmcts.reform.finrem.ccd.domain.ChildrenOrder;
import uk.gov.hmcts.reform.finrem.ccd.domain.NatureApplication;
import uk.gov.hmcts.reform.finrem.ccd.domain.NatureApplication5b;
import uk.gov.hmcts.reform.finrem.ccd.domain.YesOrNo;

import java.util.List;

@JsonIgnoreProperties(ignoreUnknown = true)
@Data
@Builder(toBuilder = true)
@AllArgsConstructor
@NoArgsConstructor
@JsonInclude(JsonInclude.Include.NON_NULL)
public class NatureApplicationWrapper {
    private List<NatureApplication> natureOfApplicationChecklist;
    private List<NatureApplication> natureOfApplication2;
    private String natureOfApplication3a;
    private String natureOfApplication3b;
    private YesOrNo orderForChildrenQuestion1;
    private YesOrNo natureOfApplication5;
    private NatureApplication5b natureOfApplication5b;
    private List<ChildrenOrder> natureOfApplication6;
    private String natureOfApplication7;
}
