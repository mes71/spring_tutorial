package com.mes71.edu.F7;

import org.springframework.stereotype.Component;

@Component
public class JavaInstructor implements Instructor {
    @Override
    public String getProgrammingExercises() {
        return "Java Instructor ha ha 😍😍😍";
    }
}
