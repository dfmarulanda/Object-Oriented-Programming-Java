package com.funlam.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.funlam.poo.service.VirtualPetGameService;
import org.springframework.beans.factory.annotation.Autowired;

import com.funlam.poo.model.Cat;
import com.funlam.poo.model.Dog;
import com.funlam.poo.model.Pet;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import java.util.Map;
@RestController
@RequestMapping("api/pet")
public class PetController {
    
    @Autowired
    private VirtualPetGameService virtualPetGameService;

    @PostMapping
    public Pet createPet(@RequestBody Map<String, Object> petData) {
        String name = (String) petData.get("name");
        String type = (String) petData.get("type");

        Pet newPet;
        if ("dog".equalsIgnoreCase(type)) {
            newPet = new Dog(name);
        } else if ("cat".equalsIgnoreCase(type)) {
            newPet = new Cat(name);
        } else {
            throw new IllegalArgumentException("Invalid pet type: " + type);
        }

        return virtualPetGameService.createPet(newPet);
    }

    @GetMapping
    public Pet getPet(){
        return virtualPetGameService.getPet();
    }
    @PostMapping("/interact")
    public String interactWithPet(){
        return virtualPetGameService.specialAction();
    }

    @PostMapping("/feed")
    public void feedPet(){
        virtualPetGameService.feed();
    }

    @PostMapping("/takeToVet")
    public void takeToVet(){
        virtualPetGameService.takeToVet();
    }

    @PostMapping("/passTime")
    public void passTime(){
        virtualPetGameService.passTime();
    }

    @GetMapping("/showStatus")
    public void showStatus(){
        virtualPetGameService.showStatus();
    }

    @PostMapping("/makeSound")
    public void makeSound(){
        virtualPetGameService.makeSound();
    }
    
}
