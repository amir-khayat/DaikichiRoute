package com.codingdojo.daikichiroutes;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/daikichi")
public class DaikichiRoutes {
	@RequestMapping("")
	public String welcome() {
		return "Welcome";
	}
	
	@RequestMapping("/message")
	public String today() {
		return "Today you will find luck in all your endeavors!";
	}
	
	@RequestMapping("/message/two")
	public String tommorow() {
		return "Tomorrow, an opportunity will arise, so be sure to be open to new ideas!";
	}
	
}
