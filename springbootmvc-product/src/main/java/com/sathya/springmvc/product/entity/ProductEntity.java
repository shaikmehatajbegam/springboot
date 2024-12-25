package com.sathya.springmvc.product.entity;


import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity 
@Table(name="Product")
public class ProductEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id; 
    private String name;
    private String brand;
    private String madein;
    private double price;
    private int quantity;
    private double taxprice; 
    private double offerprice;
    private double discountprice; 
    private double discountrate;
    private double finalprice; 
    private double stockvalue; 
}
