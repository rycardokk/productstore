package com.ecommerce.productstore.controller;

import com.ecommerce.productstore.service.MyProductService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;


@Slf4j
@Controller
@CrossOrigin(origins = "*", maxAge = 3600)
@RequiredArgsConstructor
public class MyBookListController {

    final MyProductService myProductService;

    @RequestMapping("/deleteMyList/{id}")
    public String deleteMyList(@PathVariable("id") Long id){
        myProductService.deleteById(id);
        return "redirect:/my_products";
    }


}
