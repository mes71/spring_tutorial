package com.mes71.spring_tutorial.F7;
import org.springframework.stereotype.Component;


@Component
public class JavaInstructor implements Instructor {
    @Override
    public String getProgrammingExercises() {
        return "write method for  سه  getProgrammingExercises ";
    }
}
