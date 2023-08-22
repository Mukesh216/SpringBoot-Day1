package com.example.demo.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class exercise2 {
  
      public String name="Mukesh S";
     
      @GetMapping("/name")
      public String getName()
      {
    	  return "Welcome "+name;
      }
}