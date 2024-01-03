package com.ecommerce.productstore.service.impl;

import com.ecommerce.productstore.model.MyProductList;
import com.ecommerce.productstore.repository.MyProductRepository;
import com.ecommerce.productstore.repository.ProductRepository;
import com.ecommerce.productstore.service.MyProductService;
import jakarta.transaction.Transactional;
import lombok.extern.log4j.Log4j2;
import org.springframework.stereotype.Service;

import java.util.List;

@Log4j2
@Service
public class MyProductServiceImpl implements MyProductService {

    final MyProductRepository myProductRepository;

    public MyProductServiceImpl(MyProductRepository myProductRepository){
        this.myProductRepository = myProductRepository;
    }


    @Override
    public List<MyProductList> listAllMyProducts() {
        return myProductRepository.findAll();
    }

    @Transactional
    @Override
    public MyProductList save(MyProductList myProductList) {
        return myProductRepository.save(myProductList);
    }

    @Transactional
    @Override
    public void deleteById(Long myProductId) {
        myProductRepository.deleteById(myProductId);
    }

    @Transactional
    @Override
    public MyProductList updateProduct(Long myProductId, MyProductList myProductList) {
        return null;
    }
}
