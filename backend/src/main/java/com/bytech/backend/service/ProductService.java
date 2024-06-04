package com.bytech.backend.service;

import com.bytech.backend.model.CPU;
import com.bytech.backend.model.GraphicsCard;
import com.bytech.backend.model.repository.CpuRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProductService {
    private final CpuRepository productRepository;

    @Autowired
    public ProductService(CpuRepository productRepository) {
        this.productRepository = productRepository;
    }

    public void addProduct() {
        CPU cpu = new CPU();
        cpu.setCategory("CPU");
        cpu.setDescription("Procesor Intel Core i5-12400F, 2.5 GHz, 18 MB, BOX");
        cpu.setName("Intel Core i5-12400F");
        cpu.setProducer("Intel");
        cpu.setPrice(489.00);
        cpu.setCores(6);
        cpu.setSocket("Socket 1700");
        cpu.setTdp(65);
        cpu.setFrequency(2.5);
        cpu.setMaxFrequency(4.4);
        cpu.setLine("Core i5");
        cpu.setModel("12400F");
//        GraphicsCard gpu = new GraphicsCard();
//        gpu.setCategory("GPU");
//        gpu.setDescription("NVIDIA GeForce RTX 3060 Ti, 8 GB GDDR6, 256 bit");
//        gpu.setName("NVIDIA GeForce RTX 3060 Ti");
//        gpu.setProducer("NVIDIA");
//        gpu.setPrice(1999.00);
//        gpu.setMemory("8 GB");
//        gpu.setBus("PCIe 3.0");
//        gpu.setCardLength(256);
//        gpu.setRecommendedPower(125);
//        gpu.setCoolingType("Water-Cooling");
//        productRepository.save(gpu);
        productRepository.save(cpu);
    }
}
