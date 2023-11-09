package com.crud.crud.controller;
import com.crud.crud.entity.Product;
import com.crud.crud.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;


@RestController

public class ProductController {

@Autowired
private ProductService service;

@PostMapping("/addProduct")
    public Product addProduct(@RequestBody Product product){
    return service.saveProduct(product);

}

    @PostMapping("/addProducts")
    public List<Product> addProducts(@RequestBody Product[] products){
    return service.saveProducts(Arrays.asList(products));
}
    @GetMapping("/products")
    public List<Product> findAllProducts(){
        return service.getProducts(null);
    }
@GetMapping("/products/{id}")
    public Product findProductById(@PathVariable int id){
        return service.getProductById(id);
    }
    @GetMapping("/products/{name}")
    public Product findProductByName(@PathVariable String name){
        return service.getProductByName(name);
    }
}
