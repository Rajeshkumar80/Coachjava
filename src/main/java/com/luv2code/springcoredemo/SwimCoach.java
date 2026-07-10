package com.luv2code.springcoredemo;

// Notice NO @Component here!
public class SwimCoach implements Coach {

    public SwimCoach() {
        System.out.println("In constructor: " + getClass().getSimpleName());
    }

    @Override
    public String getDailyWorkout() {
        return "Swim 1000 meters as a warm up."; // Make sure this says Swim!
    }
}