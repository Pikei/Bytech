package com.bytech.backend.api.controller;

import com.bytech.backend.model.User;
import com.bytech.backend.model.Configuration;
import com.bytech.backend.service.ConfigurationService;
import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/configurations")
public class ConfigurationController {
    private final ConfigurationService configurationService;

    public ConfigurationController(ConfigurationService configurationService) {
        this.configurationService = configurationService;
    }

    @GetMapping
    public List<Configuration> getConfigurations(@AuthenticationPrincipal User user) {
        return configurationService.getConfigurations(user);
    }
}
