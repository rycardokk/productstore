package com.ecommerce.productstore.controller;

import com.ecommerce.productstore.model.MyProductList;
import com.ecommerce.productstore.model.ProductModel;
import com.ecommerce.productstore.service.MyProductService;
import com.ecommerce.productstore.service.ProductService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import java.util.Comparator;
import java.util.List;


@Slf4j
@Controller
@CrossOrigin(origins = "*", maxAge = 3600)
@RequiredArgsConstructor
public class ProductController {

    final ProductService productService;

    final MyProductService myProductService;

    @GetMapping("/")
    public String home() {
        return "home";
    }

    @GetMapping("/product_register")
    public String productRegister(){
        return "productRegister";
    }

    @GetMapping("/available_products")
    public ModelAndView getAllProduct() {
        List<ProductModel> productList = productService.listAll();
        productList.sort(Comparator.comparingLong(ProductModel::getId));
        return new ModelAndView("productList", "product", productList);
    }

    @PostMapping("/save")
    public String saveProduct(@ModelAttribute ProductModel product){
        productService.save(product);
        return "redirect:/available_products";
    }

    @GetMapping("/my_products")
    public String getMyProducts(Model model){
        List<MyProductList> productList = myProductService.listAllMyProducts();
        productList.sort(Comparator.comparingLong(MyProductList::getId));
        model.addAttribute("product", productList);
        return "myProducts";
    }

    @RequestMapping("/myList/{id}")
    public String getMyList(@PathVariable("id") Long id){
        var productModel = productService.getProductById(id);
        MyProductList myProductList = new MyProductList(productModel.get().getId(), productModel.get().getName(),
                productModel.get().getPrice(), productModel.get().getDescription());
        myProductService.save(myProductList);
        return "redirect:/my_products";
    }

    @RequestMapping("/editProduct/{id}")
    public String updateProduct(@PathVariable("id") Long id, Model model){
        var product = productService.getProductById(id);
        model.addAttribute("product",product);
        return "productEdit";
    }

    @RequestMapping("/deleteProduct/{id}")
    public String deleteProduct(@PathVariable("id") Long id){
        productService.deleteById(id);
        return "redirect:/available_products";
    }

    @ExceptionHandler(IllegalArgumentException.class)
    public String onError(){return "redirect:/available_products";
}

}
