package com.ecommerce.productstore.controller;

import com.ecommerce.productstore.model.ProductModel;
import com.ecommerce.productstore.service.ProductService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;


@Slf4j
@Controller
@CrossOrigin(origins = "*", maxAge = 3600)
@RequiredArgsConstructor
public class ProductController {

    final ProductService productService;

    @GetMapping("/")
    public String home() {
        return "home";
    }

    @GetMapping("/product_register")
    public String productRegister(){
        return "productRegister";
    }

    @GetMapping("/available_products")
    public String getAllProduct() {
        return "productList";
    }

    @PostMapping("/save")
    public String saveProduct(@ModelAttribute ProductModel product){
        productService.save(product);
        return "redirect:/available_products";
    }

}
