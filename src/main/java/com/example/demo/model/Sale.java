package com.example.demo.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;
import java.time.LocalDateTime;

@Entity
@Table(name = "tbl_sales")
@Getter
@Setter
public class Sale {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="sale_id")
    private Integer id;

    @Column(name="item_type")
    private String itemType;

    @Column(name="sale_channel")
    private String saleChannel;

    @Column(name="order_priority")
    private String orderPriority;

    @Column(name="order_date")
    private LocalDateTime orderDate;



    @Column(name="order_id")
    private Integer orderID;

    @Column(name="ship_date")
    private LocalDateTime shipDate;

    @Column(name="units_sold")
    private Integer unitsSold;

    @Column(name="unit_price")
    private BigDecimal unitPrice;

    @Column(name="unit_cost")
    private BigDecimal unitCost;



    @Column(name="total_amount")
    private BigDecimal totalAmount;

    @Column(name="total_cost")
    private BigDecimal totalCost;

    @Column(name="total_profit")
    private BigDecimal totalProfit;

    @Column(name="region")
    private String region;

    @Column(name="country")
    private String country;





}
