package uk.ac.westminster.products_api;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/customers")
public class CustomerController {

    @GetMapping("/{id}")
    public Customers getById(@PathVariable Long id){

        Address address = new Address(
                "139 Pansal wattha",
                "Anuradhapura",
                "77788"
        );
    return new Customers(
            id,
            "Samantha",
            "Samantha123@gmail.com",
            address
    );
    }

}
