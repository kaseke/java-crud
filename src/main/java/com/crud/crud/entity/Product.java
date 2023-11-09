package com.crud.crud.entity;

import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "Product_tbl")
public class Product {

    @Id
    @GeneratedValue
    public int id;
    public String name;
    public int quantity;
    public double price;

   
}
