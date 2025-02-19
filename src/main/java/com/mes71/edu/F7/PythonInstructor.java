package com.mes71.edu.F7;

import org.springframework.stereotype.Component;


@Component
public class PythonInstructor implements Instructor {
    @Override
    public String getProgrammingExercises() {
        return "Python Instructor";
    }
}
