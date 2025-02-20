package com.mes71.edu.F7;

public class CInstructor implements Instructor {

    public CInstructor() {
        System.out.println("CInstructor Constructor");
    }

    @Override
    public String getProgrammingExercises() {
        return "CInstructor getProgrammingExercises";
    }
}
