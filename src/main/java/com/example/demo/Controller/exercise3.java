package com.example.demo.Controller;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class exercise3 {
	
	public String yourFavColor="Blue";
     @GetMapping("/color")
     public String getMyFav()
     {
    	 return "My Favourite Color is "+yourFavColor;
     }
}