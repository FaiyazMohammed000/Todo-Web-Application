package com.webapp.springboot.MyFirstWebApp.hello;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HelloContoller {
	
@RequestMapping("/hello-jsp")
public String sayHello() {
	return "sayHello";
}
}
