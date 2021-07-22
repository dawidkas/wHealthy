package pl.coderslab.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import pl.coderslab.model.Product;
import pl.coderslab.model.ProductWithWeight;
import pl.coderslab.service.ProductService;
import pl.coderslab.service.ProductWithWeightService;

@Controller
public class ProductWithWeightController {
    private final ProductWithWeightService productWithWeightService;
    private final ProductService productService;

    @Autowired
    public ProductWithWeightController(ProductWithWeightService productWithWeightService, ProductService productService) {
        this.productWithWeightService = productWithWeightService;
        this.productService = productService;
    }

    @GetMapping(value = "/product/calculator")
    public String showCalculator(Product product) {
        return "product/calculator";
    }

    @PostMapping(value = "/product/calculator")
    public String searchProductByName(Model model, @RequestParam(required = false) String name) {
            Product product = productService.findProductByName(name);
            model.addAttribute("product", product);
        return "/product/calculator";
    }
}