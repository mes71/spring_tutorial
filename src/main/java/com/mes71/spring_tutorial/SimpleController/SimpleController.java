package com.mes71.spring_tutorial.SimpleController;

import com.mes71.edu.F7.Instructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SimpleController {


    private final Instructor instructor;
    private final Instructor nInstructor;
    @Value("${instructor.name}")
    String instructorName;
    @Value("${student.class}")
    String studentClass;

 /*   @Autowired
    public SimpleController(
            @Qualifier("javaInstructor") Instructor instructor,
            @Qualifier("javaInstructor") Instructor nInstructor) {
        System.out.println("jojo => SimpleController Constructor");
        this.instructor = instructor;
        this.nInstructor = nInstructor;
    }*/


    @Autowired
    public SimpleController(
            @Qualifier("phpInstructor") Instructor instructor,
            @Qualifier("phpInstructor") Instructor nInstructor) {
        System.out.println("jojo => SimpleController Constructor");
        this.instructor = instructor;
        this.nInstructor = nInstructor;
    }


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


    @GetMapping("/getProgramming")
    String getProgramming() {
        return instructor.getProgrammingExercises();
    }


    @GetMapping("/check")
    String check() {
        return "Instructors is  " + (instructor == nInstructor);
    }
}
