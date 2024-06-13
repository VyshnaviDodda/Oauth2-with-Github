package com.jwt.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Oauth2Controller 
{
	
	@GetMapping("/")
     public String welcome() 
     {
    	 return "Welcome to Google Oauth2 Authentication";
     }
}
