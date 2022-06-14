package uk.gov.hmcts.reform.finrem.ccd.domain;


import java.util.Arrays;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public enum EstimatedAsset {

    UNABLE_TO_QUANTIFY("estimatedAssetsChecklist_"),
    UNDER_ONE_MILLION("estimatedAssetsChecklist_2"),
    ONE_TO_FIVE_MILLION("estimatedAssetsChecklist_3"),
    FIVE_TO_TEN_MILLION("estimatedAssetsChecklist_4"),
    OVER_TEN_MILLION("estimatedAssetsChecklist_5");
    private final String id;

    @JsonValue
    public String getId() {
        return id;
    }

    @JsonCreator
    public static EstimatedAsset getEstimatedAsset(String ccdType) {
        return Arrays.stream(EstimatedAsset.values())
            .filter(option -> option.id.equals(ccdType))
            .findFirst().orElseThrow(IllegalArgumentException::new);
    }
}
