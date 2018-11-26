package com.riot.leaguealytics.controller;

import com.riot.leaguealytics.dto.Summoner;
import com.riot.leaguealytics.service.SummonerService;
import io.swagger.annotations.Api;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.net.URISyntaxException;

@RestController
@Api(value = "summoner", description = "This will show summoner information")
public class SummonerController {

    @Autowired
    private SummonerService summonerService;

    @RequestMapping("summoner/{summonerName}")
    public Summoner get(@PathVariable String summonerName) throws URISyntaxException {
        return summonerService.get(summonerName);
    }
}
