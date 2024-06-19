package com.example.udemyCourse;


import java.util.Arrays;
import java.util.Date;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/users")
public class UserController {
    

    @GetMapping("/")
    public String index(){
        return "Users path";
    }
    @GetMapping("/{userId}")
    public String getUser(@PathVariable int userId){
        return "User found: " + userId;

    }
    @GetMapping("/{userId}/invoices")
    public String getInvoice(@PathVariable(value="userId") int id, @RequestParam Date date){
        return "Invoice found for user: " + id +" on date: "+date;
    }

    @GetMapping("/{userId}/items")
    public List<String> getItems(@PathVariable(value="userId") int id){
        return Arrays.asList("Shoes","Cap","Jacket","Coat");
    }
    @GetMapping("/{userId}/products")
    public List<Product> getProducts(@PathVariable(value="userId") int id){
        return Arrays.asList(new Product(0, "Shoes", 42.99),new Product(1, "Coat", 12.99),new Product(2, "Jacket", 82.99),new Product(3, "Cap", 22.99));
    }
}
