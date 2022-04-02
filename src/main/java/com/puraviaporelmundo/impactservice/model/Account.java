package com.puraviaporelmundo.impactservice.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

@Getter @Setter
@JsonIgnoreProperties(ignoreUnknown = true)
public class Account {

    @JsonProperty("CompanyName")
    private String companyName;
    @JsonProperty("Website ")
    private String website;

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Account{");
        sb.append("companyName='").append(companyName).append('\'');
        sb.append(", website='").append(website).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
