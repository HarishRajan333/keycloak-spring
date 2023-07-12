package com.mycompany.keycloak.controller;

import com.mycompany.keycloak.model.User;
import com.mycompany.keycloak.repository.UserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin
public class UserController {

    @Autowired
    UserRepo userRepo;

//    @GetMapping("/user/{id}")
//    public String getUser(@PathVariable(value = "id") int id) {
//        return "user id " + id;
//    }
    @GetMapping("/user/{id}")
    public User getUser(@PathVariable(value = "id") int id) {
        return userRepo.findById(id).get();
    }
}
