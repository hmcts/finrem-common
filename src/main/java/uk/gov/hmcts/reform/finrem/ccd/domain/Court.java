package uk.gov.hmcts.reform.finrem.ccd.domain;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonUnwrapped;
import com.fasterxml.jackson.databind.PropertyNamingStrategy;
import com.fasterxml.jackson.databind.annotation.JsonNaming;
import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import uk.gov.hmcts.reform.finrem.ccd.domain.wrapper.CourtListWrapper;
import uk.gov.hmcts.reform.finrem.ccd.domain.wrapper.DefaultCourtListWrapper;

@JsonIgnoreProperties(ignoreUnknown = true)
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class Court implements CourtListWrapper {
    private Region region;
    private RegionMidlandsFrc midlandsList;
    private RegionLondonFrc londonList;
    private RegionNorthWestFrc northWestList;
    private RegionNorthEastFrc northEastList;
    private RegionSouthEastFrc southEastList;
    private RegionSouthWestFrc southWestList;
    private RegionWalesFrc walesList;
    @JsonUnwrapped
    @Getter(AccessLevel.NONE)
    DefaultCourtListWrapper courtListWrapper;

    @JsonIgnore
    public DefaultCourtListWrapper getDefaultCourtListWrapper() {
        if (courtListWrapper == null) {
            this.courtListWrapper = new DefaultCourtListWrapper();
        }
        return courtListWrapper;
    }
}
