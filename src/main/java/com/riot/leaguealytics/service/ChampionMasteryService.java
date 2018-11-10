package com.riot.leaguealytics.service;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.riot.leaguealytics.dto.Summoner;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.client.RestTemplate;

import java.net.URI;
import java.net.URISyntaxException;

public class ChampionMasteryService {
    @Autowired
    private RestTemplate restTemplate;

    public Summoner get(String summonerName) throws URISyntaxException {
        RestTemplate restTemplate = new RestTemplate();
        ObjectMapper jsonObjectMapper = new ObjectMapper();
        Summoner summoner = null;
        String link = "https://na1.api.riotgames.com/lol/champion-mastery/v3/champion-masteries/by-summoner/" + summonerName + "?api_key=RGAPI-3ab41e76-8a54-47d5-a078-8b78a84e35bc";

        try {
            JsonNode jsonMastery = restTemplate.getForObject(new URI(link), JsonNode.class);
            log.info(link + jsonMastery);
            summoner = jsonObjectMapper.convertValue(jsonMastery, Summoner.class);

        } catch (NullPointerException e) {
            log.error("There is no summoner of that name defined", e);
        }

        return summoner;
    }
}
