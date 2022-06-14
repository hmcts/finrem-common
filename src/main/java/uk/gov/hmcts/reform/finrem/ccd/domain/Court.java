package uk.gov.hmcts.reform.finrem.ccd.domain;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.databind.PropertyNamingStrategy;
import com.fasterxml.jackson.databind.annotation.JsonNaming;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

@JsonNaming(PropertyNamingStrategy.SnakeCaseStrategy.class)
@JsonIgnoreProperties(ignoreUnknown = true)
@Data
@Builder
@AllArgsConstructor
public class Court {
    private Region region;
    private RegionMidlandsFrc midlandsList;
    private RegionLondonFrc londonList;
    private RegionNorthWestFrc northWestList;
    private RegionNorthEastFrc northEastList;
    private RegionSouthEastFrc southEastList;
    private RegionSouthWestFrc southWestList;
    private RegionWalesFrc walesList;
    private NottinghamCourt nottinghamCourtList;
    private CfcCourt cfcCourtList;
    private BirminghamCourt birminghamCourtList;
}
