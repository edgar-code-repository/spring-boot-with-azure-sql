package com.example.demo.controller;

import com.example.demo.dto.SaleDTO;
import com.example.demo.dto.SaleResponseDTO;
import com.example.demo.dto.SalesResponseDTO;
import com.example.demo.service.SaleService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@Slf4j
@RequiredArgsConstructor
public class SaleController {

    private final SaleService saleService;

    @GetMapping("/sales")
    public ResponseEntity<SalesResponseDTO> getAllSales() {
        List<SaleDTO> salesList = saleService.getSalesList();
        SalesResponseDTO responseDTO = new SalesResponseDTO(salesList);
        return ResponseEntity.ok().body(responseDTO);
    }

    @GetMapping("/sales/{saleId}")
    public ResponseEntity<SaleResponseDTO> getSaleById(@PathVariable Integer saleId) {
        SaleDTO sale = saleService.getSaleById(saleId);
        SaleResponseDTO responseDTO = new SaleResponseDTO(sale);
        return ResponseEntity.ok().body(responseDTO);
    }
    

}
