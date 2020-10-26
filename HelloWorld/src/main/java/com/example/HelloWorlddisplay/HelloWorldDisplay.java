package com.example.HelloWorlddisplay;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController

public class HelloWorldDisplay {

	
	@GetMapping("/")
	 public String display()
	 {
		 return "Hello World";
	 }
}
