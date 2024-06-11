package com.bytech.backend.api.controller;

import com.bytech.backend.api.model.ConfigurationBody;
import com.bytech.backend.model.User;
import com.bytech.backend.model.Configuration;
import com.bytech.backend.service.ConfigurationService;
import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin(origins = "http://localhost:4200")
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

    @PostMapping("/new")
    public void addConfiguration(@AuthenticationPrincipal User user, @RequestBody ConfigurationBody configurationBody) {
        configurationService.addConfiguration(user, configurationBody);
    }
}
