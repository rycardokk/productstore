package com.ecommerce.productstore.service;


import com.ecommerce.productstore.model.ProductModel;

import java.util.List;

public interface ProductService {

    List<ProductModel> listAll();

    ProductModel save(ProductModel product);

    void delete(Long productId);

    ProductModel updateProduct(Long productId, ProductModel product);


}
