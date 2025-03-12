package com.sourav.springsecurity;


import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @GetMapping("hello")
    public String hello() {
        return "Hello World";
    }

    @PreAuthorize("hasRole('ADMIN')")
    @GetMapping("admin")
    public String helloAdmin() {
        return "Hello Admin";
    }
}
