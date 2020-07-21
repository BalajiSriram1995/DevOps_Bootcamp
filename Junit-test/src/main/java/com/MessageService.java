package com;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MessageService {
	
	@GetMapping("/sum")
	public int sum() {
		return 10+20;
	}
	
	@GetMapping("/Hello")
	public String msg() {
		return "Hello World";
	}
}