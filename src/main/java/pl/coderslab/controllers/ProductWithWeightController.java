package pl.coderslab.controllers;

import org.hibernate.Session;
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

    @GetMapping(value = "/calculator")
    public String showCalculator(Product product) {
        return "calculator/start";
    }

    @PostMapping(value = "/calculator")
    public String searchProductByName(Model model, @ModelAttribute("name") String name) {
        Product product = productService.findProductByName(name);
        model.addAttribute("product", product);
        return "calculator/start";
    }

    @PostMapping(value = "/calculator/{id}")
    public String searchProductByName(Model model, @PathVariable long id) {
            Product product = productService.findProductById(id);
            model.addAttribute("product", product);
        return "calculator/calc";
    }

    @GetMapping(value = "/calculator/{id}")
    public String calculate(Model model, @PathVariable long id, @RequestParam(required = false) Double weight) {
        Product product = productService.findProductById(id);
        model.addAttribute("product", product);
        model.addAttribute("weight", weight);
        return "calculator/calc";
    }
}