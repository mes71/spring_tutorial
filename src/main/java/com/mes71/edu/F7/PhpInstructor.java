package com.mes71.edu.F7;

import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Lazy;
import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Lazy
@Scope(ConfigurableBeanFactory.SCOPE_SINGLETON)
public class PhpInstructor implements Instructor {


    public PhpInstructor() {
        System.out.println("jojo => Php Instructor Constructor");
    }

    @Override
    public String getProgrammingExercises() {
        return "Php Instructor 🧑‍🏫";
    }
}
