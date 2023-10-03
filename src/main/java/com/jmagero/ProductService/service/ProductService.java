package com.jmagero.ProductService.service;

import com.jmagero.ProductService.entity.Product;
import com.jmagero.ProductService.model.ProductRequest;
import com.jmagero.ProductService.repository.IProductRepository;
import lombok.extern.log4j.Log4j2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Log4j2
public class ProductService implements IProductService {
  @Autowired
  private IProductRepository productRepository;

  @Override
  public List<Product> getAllProducts() {
    return null;
  }

  @Override
  public Long addProduct(ProductRequest productRequest) {
    log.info("Adding Product");
    Product product = Product.builder()
            .productName(productRequest.getProductName())
            .price(productRequest.getPrice())
            .quantity(productRequest.getQuantity())
            .build();
    productRepository.save(product);
    log.info("Product created");
    return product.getProductId();
  }

  @Override
  public Product getProduct(Long productId) {
    return null;
  }

  @Override
  public void deleteProduct(Long productId) {

  }

  @Override
  public Product updateProduct(ProductRequest product) {
    return null;
  }
}
