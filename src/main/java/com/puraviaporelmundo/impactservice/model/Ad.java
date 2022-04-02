package com.puraviaporelmundo.impactservice.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
public class Ad {
    @JsonProperty("Id")
    private String id;
    @JsonProperty("Name")
    private String name;
    @JsonProperty("Description")
    private String description;
    @JsonProperty("CampaignId")
    private Integer campaignId;
    @JsonProperty("CampaignName")
    private String campaignName;
    @JsonProperty("Type")
    private String type;
    @JsonProperty("TrackingLink")
    private String trackingLink;
    @JsonProperty("LandingPageUrl")
    private String landingPageUrl;

}
