package com.jmagero.ProductService.service;

import com.jmagero.ProductService.entity.Product;
import com.jmagero.ProductService.model.ProductRequest;
import com.jmagero.ProductService.model.ProductResponse;

import java.util.List;

public interface IProductService {
    List<Product> getAllProducts();
    Long addProduct(ProductRequest productRequest);
    Product getProduct(Long productId);

    void deleteProduct(Long productId);

    Product updateProduct(ProductRequest productRequest);

    ProductResponse getProductById(Long id);
}
