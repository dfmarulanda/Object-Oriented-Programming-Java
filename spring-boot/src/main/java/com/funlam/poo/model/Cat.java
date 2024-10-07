package com.funlam.poo.model;

public class Cat extends Pet {
    private int independenceLevel;

    public Cat(String name, int age, int hungerLevel, int happinessLevel, int energyLevel, boolean isSick, int independenceLevel) {
        super(name, age, hungerLevel, happinessLevel, energyLevel, isSick);
        this.independenceLevel = independenceLevel;
    }

    public Cat(String name) {
        super(name);
        this.independenceLevel = 50;
    }

    public int getIndependenceLevel() {
        return independenceLevel;
    }

    @Override
    public void makeSound() {
        System.out.println("Meow");
    }

    @Override
    public String specialAction() {
        return "The cat is playing with a ball of yarn.";
    } 
  
}