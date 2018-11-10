package com.riot.leaguealytics.controller;

import com.riot.leaguealytics.dto.Champion;
import io.swagger.annotations.Api;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/champion")
@Api(value = "champion", description = "This will show champion information")
public class ChampionController {

    @GetMapping
    public Champion get(int championId) {
        return new Champion();
    }
}
