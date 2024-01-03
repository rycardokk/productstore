package com.ecommerce.productstore.service.impl;

import com.ecommerce.productstore.model.ProductModel;
import com.ecommerce.productstore.repository.ProductRepository;
import com.ecommerce.productstore.service.ProductService;
import lombok.extern.log4j.Log4j2;
import org.springframework.stereotype.Service;

import java.util.List;

@Log4j2
@Service
public class ProductServiceImpl implements ProductService {

    final ProductRepository productRepository;

    public ProductServiceImpl(ProductRepository productRepository){
        this.productRepository = productRepository;
    }

    @Override
    public List<ProductModel> listAll() {
        return productRepository.findAll();
    }

    @Override
    public ProductModel save(ProductModel product) {
        return productRepository.save(product);
    }

    @Override
    public void delete(Long productId) {

    }

    @Override
    public ProductModel updateProduct(Long productId, ProductModel product) {
        return null;
    }
}
