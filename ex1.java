package com.example.demo;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController 
public class ex1 {
	@GetMapping("/")
	public String Welcome() { 
		return "Welcome String Boot!";
	}
	
}