package com.funlam.poo.service;

import org.springframework.stereotype.Service;

import com.funlam.poo.model.Pet;
import com.funlam.poo.model.Dog;
@Service
public class VirtualPetGameService {

    private Pet pet;

    public VirtualPetGameService() {
        this.pet = new Dog("Firulais", 1);
    }

    public VirtualPetGameService(Pet pet) {
        this.pet = pet;
    }

    public Pet getPet(){
        return this.pet;
    }

    public void play() {
        pet.play();
    }

    public void feed() {
        pet.feed();
    }

    public void takeToVet() {
        pet.taketoVet();
    }

    public void passTime() {
        pet.passTime();
        pet.checkHealth();
    }

    public void showStatus() {
        pet.showStatus();
    }

    public void makeSound() {
        pet.makeSound();
    }

    public void specialAction() {
        pet.specialAction();
    }

}
