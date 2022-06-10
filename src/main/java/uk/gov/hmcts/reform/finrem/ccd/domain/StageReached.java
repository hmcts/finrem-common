package uk.gov.hmcts.reform.finrem.ccd.domain;

import com.fasterxml.jackson.annotation.JsonEnumDefaultValue;
import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.databind.PropertyNamingStrategy;
import com.fasterxml.jackson.databind.annotation.JsonNaming;
import lombok.RequiredArgsConstructor;

@JsonNaming(PropertyNamingStrategy.SnakeCaseStrategy.class)
@RequiredArgsConstructor
public enum StageReached {

    DECREE_NISI("Decree Nisi"),
    DECREE_ABSOLUTE("Decree Absolute"),
    PETITION_ISSUED("Petition Issued"),

    @JsonEnumDefaultValue
    UNKNOWN("unknown");

    private final String id;

    @JsonValue
    public String getId() {
        return id;
    }
}
