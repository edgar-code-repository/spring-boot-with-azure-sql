package com.example.demo.service;

import com.example.demo.dto.SaleDTO;
import com.example.demo.model.Sale;
import com.example.demo.repository.SaleRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
@Slf4j
@RequiredArgsConstructor
public class SaleService {

    private final SaleRepository saleRepository;
    private final ModelMapper modelMapper;

    public List<SaleDTO> getSalesList() {
        return saleRepository.findAll().stream()
                .map(sale -> modelMapper.map(sale, SaleDTO.class))
                .collect(Collectors.toList());
    }

    public SaleDTO getSaleById(Integer saleId) {
        Optional<Sale> optionalSale = saleRepository.findById(saleId);
        if (!optionalSale.isEmpty()) {
            return modelMapper.map(optionalSale.get(), SaleDTO.class);
        }
        return null;
    }



}
