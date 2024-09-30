package com.funlam.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.funlam.poo.service.VirtualPetGameService;
import org.springframework.beans.factory.annotation.Autowired;
import com.funlam.poo.model.Pet;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

@RestController
@RequestMapping("api/pet")
public class PetController {
    
    @Autowired
    private VirtualPetGameService virtualPetGameService;

    @GetMapping("/{id}")
    public Pet getPet(){
        return virtualPetGameService.getPet();
    }
	@GetMapping("/greeting")
    @PostMapping
    public void interactWithPet(){
        virtualPetGameService.specialAction();
    }

}
