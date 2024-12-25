package com.springbootmvc123.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor

public class Product {
	private String name;
	private String brand;
	private String madeIn;
	private double price;
	private int quantity;

}
