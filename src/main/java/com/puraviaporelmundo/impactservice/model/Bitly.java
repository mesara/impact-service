package com.puraviaporelmundo.impactservice.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Data;

@Data
@JsonIgnoreProperties(ignoreUnknown = true)
public class Bitly {

    private String link;
    private String id;
    private String long_url;

}
