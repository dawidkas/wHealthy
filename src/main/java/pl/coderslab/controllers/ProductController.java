package pl.coderslab.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;
import pl.coderslab.model.Product;
import pl.coderslab.service.ProductService;

import java.util.List;

@Controller
public class ProductController {
    private final ProductService productService;

    @Autowired
    public ProductController(ProductService productService) {
        this.productService = productService;
    }

    @RequestMapping(value = "/product/add", method = RequestMethod.GET)
    public String showForm(Product product) {
        return "product/addProduct";
    }

    @RequestMapping(value = "/product/add", method = RequestMethod.POST)
    public String addProduct(Product product, BindingResult result) {
        if (result.hasErrors()) {
            return "product/addProduct";
        }
        productService.add(product);
        return "redirect:http://localhost:8080/product/list";
    }

    @GetMapping("/product/list")
    public String productList(Model model) {
        List<Product> productList = productService.findAllProducts();
        model.addAttribute("productList", productList);
        return "/product/productList";
    }

    @GetMapping(value = "product/search")
    public String getProductByName(Product product) {
        return "product/searchProduct";
    }

    @PostMapping(value = "product/search")
    public String searchProductByName(Model model, @ModelAttribute("name") String name) {
        Product product = productService.findProductByName(name);
        model.addAttribute("product", product);
        return "/product/searchProduct";
    }
}