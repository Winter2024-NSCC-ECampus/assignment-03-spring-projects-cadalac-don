package org.example.client;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
public class BasicController {

    @Value("${user.role}")
    private String role;

    @GetMapping
    public String index() {
        return "Hello World" + role;
    }
}
