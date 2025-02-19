package com.mes71.edu.F7;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
public class PhpInstructor implements Instructor {
    @Override
    public String getProgrammingExercises() {
        return "Php Instructor 🧑‍🏫";
    }
}
