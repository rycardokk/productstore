package com.ecommerce.productstore.service;


import com.ecommerce.productstore.model.MyProductList;
import com.ecommerce.productstore.model.ProductModel;

import java.util.List;

public interface MyProductService {

    List<MyProductList> listAllMyProducts();

    MyProductList save(MyProductList myProductList);

    void deleteById(Long myProductId);

    MyProductList updateProduct(Long myProductId, MyProductList myProductList);


}
