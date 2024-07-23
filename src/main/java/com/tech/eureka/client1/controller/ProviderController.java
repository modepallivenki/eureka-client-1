package com.tech.eureka.client1.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ProviderController {

	@GetMapping("/payment/{price}")
	public String publishMessage(@PathVariable int price) {
		System.out.println("=============================price::"+price);
		return "Payment with is "+price+" is successful!";
	}
}
