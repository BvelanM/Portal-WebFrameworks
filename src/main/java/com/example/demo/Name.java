package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Name {

	    private String studentName="Monky";
	    @GetMapping("/name")
	    public String getName(){
	        return "Welcome "+studentName+"!";
	    }
}
