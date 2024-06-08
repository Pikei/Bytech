package com.bytech.backend.service;

import com.bytech.backend.api.model.*;
import com.bytech.backend.model.*;
import com.bytech.backend.repository.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ProductService {
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
    public ProductService(CaseRepository caseRepository, CpuRepository cpuRepository, CpuCoolerRepository cpuCoolerRepository, GraphicsCardRepository graphicsCardRepository, HddRepository hddRepository, MotherboardRepository motherboardRepository, PowerSupplyRepository powerSupplyRepository, RamRepository ramRepository, SsdRepository ssdRepository) {
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

    public void addProduct(AddProductBody productBody, Product product) {
        product.setName(productBody.getName());
        product.setProducer(productBody.getProducer());
        product.setCategory(productBody.getCategory());
        product.setDescription(productBody.getDescription());
        product.setPrice(productBody.getPrice());
    }

    public void addCase(AddCaseBody caseBody) {
        Case pcCase = new Case();
        addProduct(caseBody, pcCase);
        pcCase.setCaseType(caseBody.getCaseType());
        pcCase.setMaxLengthOfGPU(caseBody.getMaxLengthOfGPU());
        pcCase.setMaxHeightOfCpuCooler(caseBody.getMaxHeightOfCpuCooler());
        pcCase.setColor(caseBody.getColor());
        pcCase.setRgb(caseBody.getRgb());
        pcCase.setWindow(caseBody.getWindow());
        pcCase.setHeight(caseBody.getHeight());
        pcCase.setWidth(caseBody.getWidth());
        pcCase.setDepth(caseBody.getDepth());
        pcCase.setCompatibilities(caseBody.getCompatibilities());
        pcCase.setFans(caseBody.getFans());
        pcCase.setFansDiameter(caseBody.getFansDiameter());
        pcCase.setUsbPorts(caseBody.getUsbPorts());
        caseRepository.save(pcCase);
    }

    public void addCpu(AddCpuBody cpuBody) {
        CPU cpu = new CPU();
        addProduct(cpuBody, cpu);
        cpu.setCores(cpuBody.getCores());
        cpu.setSocket(cpuBody.getSocket());
        cpu.setTdp(cpuBody.getTdp());
        cpu.setFrequency(cpuBody.getFrequency());
        cpu.setMaxFrequency(cpuBody.getMaxFrequency());
        cpu.setLine(cpuBody.getLine());
        cpu.setModel(cpuBody.getModel());
        cpuRepository.save(cpu);
    }

    public void addCpuCooler(AddCpuCooler cpuCoolerBody) {
        CpuCooler cpuCooler = new CpuCooler();
        addProduct(cpuCoolerBody, cpuCooler);
        cpuCooler.setFanSpeed(cpuCoolerBody.getFanSpeed());
        cpuCooler.setFanDiameter(cpuCoolerBody.getFanDiameter());
        cpuCooler.setFans(cpuCoolerBody.getFans());
        cpuCooler.setHeight(cpuCoolerBody.getHeight());
        cpuCooler.setWidth(cpuCoolerBody.getWidth());
        cpuCooler.setDepth(cpuCoolerBody.getDepth());
        cpuCooler.setRgb(cpuCoolerBody.getRgb());
        cpuCooler.setCpuSockets(cpuCoolerBody.getCpuSockets());
        cpuCoolerRepository.save(cpuCooler);
    }

    public void addGraphicsCard(AddGpuBody gpuBody) {
        GraphicsCard gpu = new GraphicsCard();
        addProduct(gpuBody, gpu);
        gpu.setChipsetProducer(gpuBody.getChipsetProducer());
        gpu.setChipsetType(gpuBody.getChipsetType());
        gpu.setMemory(gpuBody.getMemory());
        gpu.setBus(gpuBody.getBus());
        gpu.setCardLength(gpuBody.getCardLength());
        gpu.setRecommendedPower(gpuBody.getRecommendedPower());
        gpu.setCoolingType(gpuBody.getCoolingType());
        graphicsCardRepository.save(gpu);
    }

    public void addHdd(AddHddBody hddBody) {
        HDD hdd = new HDD();
        addProduct(hddBody, hdd);
        hdd.setFormat(hddBody.getFormat());
        hdd.setInterfaceType(hddBody.getInterfaceType());
        hdd.setCapacity(hddBody.getCapacity());
        hdd.setRotationalSpeed(hddBody.getRotationalSpeed());
        hddRepository.save(hdd);
    }

    public void addMotherboard(AddMotherboardBody motherboardBody) {
        Motherboard mb = new Motherboard();
        addProduct(motherboardBody, mb);
        mb.setChipset(motherboardBody.getChipset());
        mb.setSocket(motherboardBody.getSocket());
        mb.setMemoryStandard(motherboardBody.getMemoryStandard());
        mb.setMemorySlots(motherboardBody.getMemorySlots());
        mb.setMemoryMaxCapacity(motherboardBody.getMemoryMaxCapacity());
        mb.setMemoryType(motherboardBody.getMemoryType());
        mb.setSupportedMemoryFrequencies(motherboardBody.getSupportedMemoryFrequencies());
        mb.setMbStandard(motherboardBody.getMbStandard());
        mb.setWidth(motherboardBody.getWidth());
        mb.setDepth(motherboardBody.getDepth());
        mb.setWifi(motherboardBody.getWifi());
        mb.setBluetooth(motherboardBody.getBluetooth());
        mb.setAudio(motherboardBody.getAudio());
        mb.setM2Slots(motherboardBody.getM2Slots());
        mb.setSataPorts(motherboardBody.getSataPorts());
        mb.setUsbPorts(motherboardBody.getUsbPorts());
        motherboardRepository.save(mb);
    }

    public void addPowerSupply(AddPowerSupplyBody powerSupplyBody) {
        PowerSupply ps = new PowerSupply();
        addProduct(powerSupplyBody, ps);
        ps.setCertification(powerSupplyBody.getCertification());
        ps.setEfficiency(powerSupplyBody.getEfficiency());
        ps.setPower(powerSupplyBody.getPower());
        ps.setModularity(powerSupplyBody.getModularity());
        ps.setStandard(powerSupplyBody.getStandard());
        ps.setFanDiameter(powerSupplyBody.getFanDiameter());
        ps.setHeight(powerSupplyBody.getHeight());
        ps.setWidth(powerSupplyBody.getWidth());
        ps.setDepth(powerSupplyBody.getDepth());
        powerSupplyRepository.save(ps);
    }

    public void addRam(AddRamBody ramBody) {
        RAM ram = new RAM();
        addProduct(ramBody, ram);
        ram.setCapacity(ramBody.getCapacity());
        ram.setType(ramBody.getType());
        ram.setFrequency(ramBody.getFrequency());
        ram.setVoltage(ramBody.getVoltage());
        ram.setDelay(ramBody.getDelay());
        ram.setNumberOfModules(ramBody.getNumberOfModules());
        ramRepository.save(ram);
    }

    public void addSsd(AddSsdBody ssdBody) {
        SSD ssd = new SSD();
        addProduct(ssdBody, ssd);
        ssd.setFormat(ssdBody.getFormat());
        ssd.setInterfaceType(ssdBody.getInterfaceType());
        ssd.setCapacity(ssdBody.getCapacity());
        ssd.setReadSpeed(ssdBody.getReadSpeed());
        ssd.setWriteSpeed(ssdBody.getWriteSpeed());
        ssdRepository.save(ssd);
    }

    public List<Product> getAllProducts() {
        List<Product> products = new ArrayList<>();
        products.addAll(caseRepository.findAll());
        products.addAll(cpuRepository.findAll());
        products.addAll(cpuCoolerRepository.findAll());
        products.addAll(graphicsCardRepository.findAll());
        products.addAll(hddRepository.findAll());
        products.addAll(motherboardRepository.findAll());
        products.addAll(powerSupplyRepository.findAll());
        products.addAll(ramRepository.findAll());
        products.addAll(ssdRepository.findAll());
        return products;
    }
}
