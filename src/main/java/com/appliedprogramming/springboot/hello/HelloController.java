package com.appliedprogramming.springboot.hello;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
	
	@RequestMapping("/hello")
	public String sayHi()
	{
	 return "hi this show me changes in file";
	}
	
}
