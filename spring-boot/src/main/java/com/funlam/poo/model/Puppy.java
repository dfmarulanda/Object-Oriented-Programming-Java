package com.funlam.poo.model;

public class Puppy extends Dog {
    public Puppy(String name, int age, int hungerLevel, int happinessLevel, int energyLevel, boolean isSick, int loyaltyLevel) {
        super(name, age, hungerLevel, happinessLevel, energyLevel, isSick, loyaltyLevel);
    }

    public Puppy(String name){
        super(name);
    }

    @Override
    public void makeSound() {
        System.out.println("Woof de puppy");
    }

    @Override
    public String specialAction() {
        return "The puppy is playing with a ball of yarn.";
    }
}
    