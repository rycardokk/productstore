package com.ecommerce.productstore.repository;

import com.ecommerce.productstore.model.MyProductList;
import com.ecommerce.productstore.model.ProductModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MyProductRepository extends JpaRepository<MyProductList, Long> {


}
