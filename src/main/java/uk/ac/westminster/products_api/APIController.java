package uk.ac.westminster.products_api;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class APIController {

    @GetMapping("/home")
    public String home() {
        return "Hello World";
    }

    @GetMapping("/info")
    public String info() {
        return "1234";
    }

    @GetMapping("/goodbye")
    public String goodbye() {
        return "Goodbye";
    }
}