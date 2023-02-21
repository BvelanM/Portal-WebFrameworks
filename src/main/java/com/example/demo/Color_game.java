package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Color_game {

	    private String favColor="Lavender";
	    @GetMapping("/col")
	    public String myFav(){
	        return "My favorite color is "+favColor;
	    }
}
