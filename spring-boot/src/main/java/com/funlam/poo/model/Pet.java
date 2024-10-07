package com.funlam.poo.model;

public abstract class Pet {

    private String name;
    private int age;
    private int hungerLevel;
    private int happinessLevel;
    private int energyLevel;
    private boolean isSick;

    public Pet(String name){
        this.name = name;
        this.age = 0;
        this.hungerLevel = 50;
        this.happinessLevel = 50;
        this.energyLevel = 50;
        this.isSick = false;
    }

    public Pet(String name, int age, int hungerLevel, int happinessLevel, int energyLevel, boolean isSick) {
        this.name = name;
        this.age = age;
        this.hungerLevel = hungerLevel;
        this.happinessLevel = happinessLevel;
        this.energyLevel = energyLevel;
        this.isSick = isSick;
    }


    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public int getHungerLevel() {
        return hungerLevel;
    }

    public int getHappinessLevel() {
        return happinessLevel;
    }

    public int getEnergyLevel() {
        return energyLevel;
    }

    public boolean isSick() {
        return isSick;
    }

    public void setName(String name) {
        this.name = name;
    }  

    public void setAge(int age) {
        this.age = age;
    }

    public void setHungerLevel(int hungerLevel) {
        if (hungerLevel < 0) {
            this.hungerLevel = 0;
        } else if (hungerLevel > 100) {
            this.hungerLevel = 100;
        } else {
            this.hungerLevel = hungerLevel;
        }
    }

    public void setHappinessLevel(int happinessLevel) {
        if (happinessLevel < 0) {
            this.happinessLevel = 0;
        } else if (happinessLevel > 100) {
            this.happinessLevel = 100;
        } else {
            this.happinessLevel = happinessLevel;
        }
    }

    public void setEnergyLevel(int energyLevel) {
        if (energyLevel < 0) {
            this.energyLevel = 0;
        } else if (energyLevel > 100) {
            this.energyLevel = 100;
        } else {
            this.energyLevel = energyLevel;
        }
    }

    public void setIsSick(boolean isSick) {
        this.isSick = isSick;
    }

    public void feed() {
        setHungerLevel(getHungerLevel() + 10);
        setHappinessLevel(getHappinessLevel() + 5);
        setEnergyLevel(getEnergyLevel() - 5);
    }
    public void play() {
        setHappinessLevel(getHappinessLevel() + 10);
        setHungerLevel(getHungerLevel() - 5);
        setEnergyLevel(getEnergyLevel() - 5);
    }

    public void sleep() {
        setEnergyLevel(getEnergyLevel() + 10);
        setHungerLevel(getHungerLevel() - 5);
        setHappinessLevel(getHappinessLevel() - 5);
    }

    public void checkHealth() {
        if (getHungerLevel() <= 20 || getEnergyLevel() <= 20) {
            setIsSick(true);
            setHappinessLevel(getHappinessLevel() - 10);
        } 
    }

    public void taketoVet() {
        setIsSick(false);
        setHappinessLevel(getHappinessLevel() - 10);
    }

    public void passTime() {
        setHungerLevel(getHungerLevel() - 15);
        setHappinessLevel(getHappinessLevel() - 15);
        setEnergyLevel(getEnergyLevel() - 15);
    }

    public void showStatus() {
        System.out.println("Name: " + getName());
        System.out.println("Age: " + getAge());
        System.out.println("Hunger Level: " + getHungerLevel());
        System.out.println("Happiness Level: " + getHappinessLevel());
        System.out.println("Energy Level: " + getEnergyLevel());
        System.out.println("Is Sick: " + isSick());
    }

    public abstract void makeSound();
    public abstract String specialAction();

}
