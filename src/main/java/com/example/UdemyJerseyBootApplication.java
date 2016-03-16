package com.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@SpringBootApplication
@Controller
@RequestMapping("/hello")
public class UdemyJerseyBootApplication {

	public static void main(String[] args) {
		SpringApplication.run(UdemyJerseyBootApplication.class, args);
	}
	
	@RequestMapping("")
	@ResponseBody
	public String hello() {
		return "Hello World!";
	}
}
