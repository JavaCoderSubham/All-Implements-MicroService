package com.crud.microservice.microServicecrud.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/message")
public class UserController {

    @GetMapping
    public String message() {
        return "Hello Message";
    }

}
