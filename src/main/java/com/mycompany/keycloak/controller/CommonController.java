package com.mycompany.keycloak.controller;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin
public class CommonController {

    @GetMapping("/common/get")
    public String getData() {
        return "Hello...";
    }

}
