package uk.ac.westminster.products_api;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Collections;
import java.util.List;

@RestController
@RequestMapping("/products")
public class ProductController {
    @Autowired
    private ProductService productService;
    @GetMapping
    public List<Product> getAllProducts() {
        return productService.getAllProducts();
    }
    @GetMapping("/{id}")
    public Product getById(@PathVariable Long id){
        return new Product(id, "Laptop", 999.99);
    }
    @GetMapping("/products/{id}")
    public List<Product> getByCategory(@PathVariable Long id){
        return Collections.singletonList(productService.getProductById(id).orElse(null));
    }
    @PostMapping ("/products")
    public Product addProduct(@RequestBody Product product){
        return productService.addProduct(product);
    }
    @GetMapping("/products/search")
    public List<Product> searchProducts(@RequestParam String name){
        return productService.findByName(name);
    }

}
