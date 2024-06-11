package com.bytech.backend.service;

import com.bytech.backend.model.User;
import com.bytech.backend.model.Configuration;
import com.bytech.backend.repository.ConfigurationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ConfigurationService {
    private final ConfigurationRepository configurationRepository;

    @Autowired
    public ConfigurationService(ConfigurationRepository configurationRepository) {
        this.configurationRepository = configurationRepository;
    }

    public List<Configuration> getConfigurations(User user) {
        return configurationRepository.findByUser(user);
    }

    public void addConfiguration(User user) {
    }
}
