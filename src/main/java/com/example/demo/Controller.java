package com.example.demo;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {
     @RequestMapping("/get")
     public String get() {
    	 return "Hello World";
     }
}
