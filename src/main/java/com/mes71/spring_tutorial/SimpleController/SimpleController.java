package com.mes71.spring_tutorial.SimpleController;

import com.mes71.edu.F7.Instructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SimpleController {


    @Value("${instructor.name}")
    String instructorName;
    @Value("${student.class}")
    String studentClass;
    @Autowired
    @Qualifier("CIS")
    private Instructor instructor;

    @GetMapping("/")
    String sayHello() {
        return "Hello World";
    }


    @GetMapping("/goodbye")
    String sayGoodbye() {
        return "Goodbye World";
    }


    @GetMapping("/classInfo")
    String getClassInfo() {
        return "Instructor: " + instructorName + " Student Class: " + studentClass;
    }


    @GetMapping("/lifeCycle")
    String getLifeCycleInfo() {
        return "hi";
    }


    @GetMapping("/getProgramming")
    String getProgramming() {
        return instructor.getProgrammingExercises();
    }


}
