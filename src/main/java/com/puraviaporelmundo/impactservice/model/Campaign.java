package com.puraviaporelmundo.impactservice.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
public class Campaign {

    @JsonProperty("AdvertiserId")
    private Integer advertiserId;
    @JsonProperty("AdvertiserName")
    private String advertiserName;
    @JsonProperty("CampaignId")
    private Integer campaignId ;
    @JsonProperty("CampaignName")
    private String campaignName ;
    @JsonProperty("TrackingLink")
    private String trackingLink;
}
