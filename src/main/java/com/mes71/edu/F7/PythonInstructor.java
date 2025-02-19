package com.mes71.edu.F7;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;


@Component
@Primary
public class PythonInstructor implements Instructor {
    @Override
    public String getProgrammingExercises() {
        return "Python Instructor";
    }
}
