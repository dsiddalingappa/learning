/**
 * 
 */
package com.learning.spring.boot.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author dsiddalingappa
 *
 */
@RestController
public class LearningController {
	
	@GetMapping("/bot")
	public String home() {
		return "Happy Learning";
	}

}
