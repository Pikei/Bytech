package com.bytech.backend.service;

import com.bytech.backend.api.model.ConfigurationBody;
import com.bytech.backend.model.User;
import com.bytech.backend.model.Configuration;
import com.bytech.backend.model.product.*;
import com.bytech.backend.repository.ConfigurationRepository;
import com.bytech.backend.repository.product.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ConfigurationService {
    private final ConfigurationRepository configurationRepository;
    private final CaseRepository caseRepository;
    private final CpuRepository cpuRepository;
    private final CpuCoolerRepository cpuCoolerRepository;
    private final GraphicsCardRepository graphicsCardRepository;
    private final HddRepository hddRepository;
    private final MotherboardRepository motherboardRepository;
    private final PowerSupplyRepository powerSupplyRepository;
    private final RamRepository ramRepository;
    private final SsdRepository ssdRepository;

    @Autowired
    public ConfigurationService(ConfigurationRepository configurationRepository, CaseRepository caseRepository, CpuRepository cpuRepository, CpuCoolerRepository cpuCoolerRepository, GraphicsCardRepository graphicsCardRepository, HddRepository hddRepository, MotherboardRepository motherboardRepository, PowerSupplyRepository powerSupplyRepository, RamRepository ramRepository, SsdRepository ssdRepository) {
        this.configurationRepository = configurationRepository;
        this.caseRepository = caseRepository;
        this.cpuRepository = cpuRepository;
        this.cpuCoolerRepository = cpuCoolerRepository;
        this.graphicsCardRepository = graphicsCardRepository;
        this.hddRepository = hddRepository;
        this.motherboardRepository = motherboardRepository;
        this.powerSupplyRepository = powerSupplyRepository;
        this.ramRepository = ramRepository;
        this.ssdRepository = ssdRepository;
    }

    public List<Configuration> getConfigurations(User user) {
        return configurationRepository.findByUser(user);
    }

    public void addConfiguration(User user, ConfigurationBody configurationBody) {
        Configuration configuration = new Configuration();
        Optional<CPU> cpu = cpuRepository.findById(configurationBody.getCpuID());
        Optional<Case> pcCase = caseRepository.findById(configurationBody.getPcCaseID());
        Optional<CpuCooler> cpuCooler = cpuCoolerRepository.findById(configurationBody.getCoolerID());
        Optional<GraphicsCard> graphicsCard = graphicsCardRepository.findById(configurationBody.getGpuID());
        Optional<HDD> hdd = hddRepository.findById(configurationBody.getHddID());
        Optional<Motherboard> motherboard = motherboardRepository.findById(configurationBody.getMotherBoardID());
        Optional<PowerSupply> powerSupply = powerSupplyRepository.findById(configurationBody.getPowerSupplyID());
        Optional<RAM> ram = ramRepository.findById(configurationBody.getRamID());
        Optional<SSD> ssd = ssdRepository.findById(configurationBody.getSsdID());

        configuration.setUser(user);
        configuration.setName(configurationBody.getName());
        configuration.setDescription(configurationBody.getDescription());
        cpu.ifPresent(configuration::setCpu);
        pcCase.ifPresent(configuration::setPcCase);
        cpuCooler.ifPresent(configuration::setCooler);
        graphicsCard.ifPresent(configuration::setGpu);
        hdd.ifPresent(configuration::setHdd);
        motherboard.ifPresent(configuration::setMotherBoard);
        powerSupply.ifPresent(configuration::setPowerSupply);
        ram.ifPresent(configuration::setRam);
        ssd.ifPresent(configuration::setSsd);

        configurationRepository.save(configuration);
    }
}
