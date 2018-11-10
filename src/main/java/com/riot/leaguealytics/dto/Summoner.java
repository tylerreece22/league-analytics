package com.riot.leaguealytics.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

@Data
public class Summoner {
    @JsonProperty
    private int profileIconId;
    @JsonProperty
    private String name;
    @JsonProperty
    private long summonerLevel;
    @JsonProperty
    private long revisionDate;
    @JsonProperty
    private long id;
    @JsonProperty
    private long accountId;
}
