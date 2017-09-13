package com.girapay.keycloak.appgira.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import com.girapay.keycloak.appgira.services.ProductService;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;

public class ProductController {


    @Autowired
    ProductService productService;

    @GetMapping(path = "/products")
    public String getProducts(Model model){
		
		model.addAttribute("products", productService.getProducts());
        return "products";
    }
    @GetMapping(path = "/logout")
    public String logout(HttpServletRequest request) throws ServletException {
        request.logout();
        return "/";
    }
}
