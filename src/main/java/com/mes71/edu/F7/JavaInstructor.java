package com.mes71.edu.F7;

import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.Lazy;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Lazy
@Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE)
public class JavaInstructor implements Instructor {

    public JavaInstructor() {
        System.out.println("jojo => Java Instructor Constructor");
    }

    @Override
    public String getProgrammingExercises() {
        return "Java Instructor ha ha 😍😍😍";
    }
}
