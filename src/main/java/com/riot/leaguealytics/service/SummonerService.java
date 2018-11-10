package com.riot.leaguealytics.service;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.riot.leaguealytics.dto.Summoner;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.net.URI;
import java.net.URISyntaxException;


@Slf4j
@Service
public class SummonerService {
    @Autowired
    private RestTemplate restTemplate;

    public Summoner get(String summonerName) throws URISyntaxException {
        RestTemplate restTemplate = new RestTemplate();
        ObjectMapper jsonObjectMapper = new ObjectMapper();
        Summoner summoner = null;
        String link = "https://na1.api.riotgames.com/lol/summoner/v3/summoners/by-name/" + summonerName + "?api_key=RGAPI-3ab41e76-8a54-47d5-a078-8b78a84e35bc";

        try {
            JsonNode jsonSummoner = restTemplate.getForObject(new URI(link), JsonNode.class);
            log.info(link + jsonSummoner);
            summoner = jsonObjectMapper.convertValue(jsonSummoner, Summoner.class);

        } catch (NullPointerException e) {
            log.error("There is no summoner of that name defined", e);
        }

        return summoner;
    }
}