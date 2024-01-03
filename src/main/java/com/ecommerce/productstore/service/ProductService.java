package com.ecommerce.productstore.service;


import com.ecommerce.productstore.model.ProductModel;

import java.util.List;
import java.util.Optional;

public interface ProductService {

    List<ProductModel> listAll();

    ProductModel save(ProductModel product);

    void deleteById(Long productId);

    Optional<ProductModel> getProductById(Long id);

}
