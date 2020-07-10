package com.learning.spring.boot.bot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class LearningBotApplication {

	@RequestMapping("/")
	public String learningHome() {
		return "Happy bot learning";
	}

	public static void main(String[] args) {
		SpringApplication.run(LearningBotApplication.class, args);
	}

}
