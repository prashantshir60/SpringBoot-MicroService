package com.ms.service.limitservice.controller;

import com.ms.service.limitservice.beans.Limits;
import com.ms.service.limitservice.config.Configuration;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LimitsController {

    @Autowired
    private Configuration config;

    @GetMapping("/limits")
    public Limits getLimit() {
        return new Limits(1, 1000);
    }
    @GetMapping("/limits-props")
    public Limits getLimitProps() {
        return new Limits(config.getMin(), config.getMax());
    }

}
