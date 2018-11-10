package com.riot.leaguealytics.controller;

import com.riot.leaguealytics.dto.Summoner;
import io.swagger.annotations.Api;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/summoner")
@Api(value = "summoner", description = "This will show summoner information")
public class SummonerController {

    @GetMapping
    public Summoner get(int summonerId) {
        return new Summoner();
    }
}
