package com.mes71.spring_tutorial.SimpleController;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SimpleController {


    @GetMapping("/")
    String sayHello() {
        return "Hello World";
    }


    @GetMapping("/goodbye")
    String sayGoodbye() {
        return "Goodbye World";
    }
}
