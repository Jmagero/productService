package com.jmagero.ProductService.controller;

import com.jmagero.ProductService.entity.Product;
import com.jmagero.ProductService.model.ProductRequest;
import com.jmagero.ProductService.model.ProductResponse;
import com.jmagero.ProductService.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/products")
public class ProductController {

    private ProductService productService;

    @Autowired
    public ProductController(ProductService productService) {
        this.productService = productService;
    }

    @GetMapping()
    List<Product> getProducts(){
        return null;
    }

    @PostMapping()
    ResponseEntity<Long> addProduct(@RequestBody ProductRequest productRequest){
        Long productId = productService.addProduct(productRequest);
        return new ResponseEntity<>(productId, HttpStatus.CREATED);
    }

    @GetMapping("/{id}")
    ResponseEntity<ProductResponse> getProduct(@PathVariable Long id){
        ProductResponse product = productService. getProductById(id);
        return new ResponseEntity<>(product, HttpStatus.OK);
    }

}
