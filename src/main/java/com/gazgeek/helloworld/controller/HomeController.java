package com.gazgeek.helloworld.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.boot.config.user;

@RestController
public class HomeController {

	@RequestMapping("/")
	String home() {

		System.out.println("Harsha");

		return "Hello from GazGeek!";
	}

}
