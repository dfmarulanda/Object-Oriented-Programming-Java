package com.funlam.poo;

import com.funlam.poo.model.Dog;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RestController;


@SpringBootApplication
@RestController
public class PooApplication {

	public static void main(String[] args) {
		SpringApplication.run(PooApplication.class, args);
	}

}