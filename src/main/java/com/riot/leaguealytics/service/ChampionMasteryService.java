package com.riot.leaguealytics.service;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.riot.leaguealytics.dto.ChampionMastery;
import com.riot.leaguealytics.dto.Summoner;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.client.RestTemplate;

import java.net.URI;
import java.net.URISyntaxException;
import java.util.List;

public class ChampionMasteryService {
    @Autowired
    private RestTemplate restTemplate;
    @Autowired
    private SummonerService summonerService;

    public List<ChampionMastery> get(String summonerName) throws URISyntaxException {
        Summoner summoner = summonerService.get(summonerName);
        summoner.getId();

        return null;
    }
}
