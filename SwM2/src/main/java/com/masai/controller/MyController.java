package com.masai.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "check")
public class MyController {
	
	@GetMapping(value = "/done")
	public String check() {
		return "done";
	}
}
