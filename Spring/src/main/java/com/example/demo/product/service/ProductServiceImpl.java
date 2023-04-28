package com.example.demo.product.service;


import com.example.demo.product.entity.ProductEntity;
import com.example.demo.product.repository.ProductRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Slf4j
@Service
@RequiredArgsConstructor
public class ProductServiceImpl implements ProductService{

    final private ProductRepository productRepository;

    @Override
    public ProductEntity register(ProductEntity productEntity) {
        return productRepository.save(productEntity);
    }
}