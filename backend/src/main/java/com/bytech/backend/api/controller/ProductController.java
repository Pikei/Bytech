package com.bytech.backend.api.controller;

import com.bytech.backend.api.model.product.*;
import com.bytech.backend.model.product.Product;
import com.bytech.backend.service.ProductService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/products")
@CrossOrigin(origins = "http://localhost:4200")
public class ProductController {
    private final ProductService productService;

    public ProductController(ProductService productService) {
        this.productService = productService;
    }

    @GetMapping("/all")
    public List<Product> getAllProducts() {
        return productService.getAllProducts();
    }

    @PostMapping("/add/case")
    public ResponseEntity<Void> addCase(@RequestBody AddCaseBody addCaseBody) {
        productService.addCase(addCaseBody);
        return ResponseEntity.ok().build();
    }

    @PostMapping("/add/cpu")
    public ResponseEntity<Void> addCpu(@RequestBody AddCpuBody cpuBody) {
        productService.addCpu(cpuBody);
        return ResponseEntity.ok().build();
    }

    @PostMapping("/add/cooler")
    public ResponseEntity<Void> addCpu(@RequestBody AddCpuCooler coolerBody) {
        productService.addCpuCooler(coolerBody);
        return ResponseEntity.ok().build();
    }

    @PostMapping("/add/gpu")
    public ResponseEntity<Void> addGpu(@RequestBody AddGpuBody gpuBody) {
        productService.addGraphicsCard(gpuBody);
        return ResponseEntity.ok().build();
    }

    @PostMapping("/add/hdd")
    public ResponseEntity<Void> addHdd(@RequestBody AddHddBody hddBody) {
        productService.addHdd(hddBody);
        return ResponseEntity.ok().build();
    }

    @PostMapping("/add/motherboard")
    public ResponseEntity<Void> addMotherboard(@RequestBody AddMotherboardBody motherboardBody) {
        productService.addMotherboard(motherboardBody);
        return ResponseEntity.ok().build();
    }

    @PostMapping("/add/power-supply")
    public ResponseEntity<Void> addPower(@RequestBody AddPowerSupplyBody powerBody) {
        productService.addPowerSupply(powerBody);
        return ResponseEntity.ok().build();
    }

    @PostMapping("/add/ram")
    public ResponseEntity<Void> addRam(@RequestBody AddRamBody addRamBody) {
        productService.addRam(addRamBody);
        return ResponseEntity.ok().build();
    }

    @PostMapping("/add/ssd")
    public ResponseEntity<Void> addSsd(@RequestBody AddSsdBody ssdBody) {
        productService.addSsd(ssdBody);
        return ResponseEntity.ok().build();
    }

}
