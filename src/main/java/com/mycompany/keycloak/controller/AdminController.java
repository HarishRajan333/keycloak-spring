package com.mycompany.keycloak.controller;

import com.mycompany.keycloak.repository.UserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
//@CrossOrigin(origins = {"http://localhost:3000"})
public class AdminController {

    @Autowired
    UserRepo userRepo;

    @PostMapping("/admin/add")
    public String addUser() {
        return "user Added.";
    }

    @GetMapping("/admin/get")
    public String getUser() {
        System.out.println("<<<<<<>>>>>>>>");
        return "user one.";
    }

//    @PostMapping("/admin/add")
//    public User addUser(@RequestBody User user) {
//        return userRepo.save(user);
//    }
//
//    @GetMapping("/admin/add")
//    public List<User> getUser() {
//        return userRepo.findAll();
//    }
}
