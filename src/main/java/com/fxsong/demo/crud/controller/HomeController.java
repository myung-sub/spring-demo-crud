package com.fxsong.demo.crud.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {

    @GetMapping
    String index() {
        return "Hello Crud App";
    }
}
