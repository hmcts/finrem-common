package uk.gov.hmcts.reform.finrem.ccd.domain.wrapper;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonUnwrapped;
import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;

@JsonIgnoreProperties(ignoreUnknown = true)
@Data
@Builder(toBuilder = true)
@AllArgsConstructor
@NoArgsConstructor
@JsonInclude(JsonInclude.Include.NON_NULL)
public class RegionWrapper {
    @JsonUnwrapped
    @Getter(AccessLevel.NONE)
    DefaultRegionWrapper defaultRegionWrapper;
    @JsonUnwrapped
    @Getter(AccessLevel.NONE)
    InterimRegionWrapper interimRegionWrapper;
    @JsonUnwrapped
    @Getter(AccessLevel.NONE)
    GeneralApplicationRegionWrapper generalApplicationRegionWrapper;

    @JsonIgnore
    public DefaultRegionWrapper getDefaultRegionWrapper() {
        if (defaultRegionWrapper == null) {
            this.defaultRegionWrapper = new DefaultRegionWrapper();
        }
        return defaultRegionWrapper;
    }

    @JsonIgnore
    public InterimRegionWrapper getInterimRegionWrapper() {
        if (interimRegionWrapper == null) {
            this.interimRegionWrapper = new InterimRegionWrapper();
        }
        return interimRegionWrapper;
    }

    @JsonIgnore
    public GeneralApplicationRegionWrapper getGeneralApplicationRegionWrapper() {
        if (generalApplicationRegionWrapper == null) {
            this.generalApplicationRegionWrapper = new GeneralApplicationRegionWrapper();
        }
        return generalApplicationRegionWrapper;
    }
}
