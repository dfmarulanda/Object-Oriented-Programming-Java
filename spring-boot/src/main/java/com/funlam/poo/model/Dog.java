package com.funlam.poo.model;

public class Dog extends Pet {
    private int loyaltyLevel;


    public Dog(String name, int age, int hungerLevel, int happinessLevel, int energyLevel, boolean isSick, int loyaltyLevel) {
        super(name, age, hungerLevel, happinessLevel, energyLevel, isSick);
        this.loyaltyLevel = loyaltyLevel;
    }

    public Dog(String name) {
        super(name);
        this.loyaltyLevel = 50;
    }
    
    public Dog(String name, int age) {
        super(name, 0, 50, 50, 50, false);
        this.loyaltyLevel = 50;
    }

    public Dog(int age, String name) {
        super(name, 0, 50, 50, 50, false);
        this.loyaltyLevel = 50;
    }

    public int getLoyaltyLevel() {
        return loyaltyLevel;
    }

    @Override
    public void makeSound() {
        System.out.println("Woof");
    }

    @Override
    public String specialAction() {
        return "The dog is playing fetch.";
    }
    
    
    

}
