package com.funlam.poo.service;

import org.springframework.stereotype.Service;

import com.funlam.poo.model.Dog;
import com.funlam.poo.model.Pet;
import com.funlam.poo.model.Cat;

@Service
public class VirtualPetGameService {

    private Pet pet;

    public VirtualPetGameService() {}

    public Pet createPet(Pet newPet) {
        this.pet = newPet;
        return this.pet;
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

    public String specialAction() {
        return pet.specialAction();
    }

}
