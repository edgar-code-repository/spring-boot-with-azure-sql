package com.example.demo.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.math.BigDecimal;
import java.time.LocalDateTime;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class SaleDTO {

    private Integer id;

    private String itemType;

    private LocalDateTime orderDate;

    private Integer orderID;

    private Integer unitsSold;

    private BigDecimal unitPrice;

    private BigDecimal unitCost;

    private BigDecimal totalAmount;

    private String region;

    private String country;


}
