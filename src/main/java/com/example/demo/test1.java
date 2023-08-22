package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class test1 {
	@GetMapping("g")
	public String Display() {
		return "hello world";
	}
}
