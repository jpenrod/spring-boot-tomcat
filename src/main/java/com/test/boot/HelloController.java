package com.test.boot;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
	
	@RequestMapping("/")
    public String index() {
        return "Greetings from Spring Boot Docker Style!";
    }
	
	@RequestMapping(value = "/hello/{name}", method = RequestMethod.GET)
	public String helloName(@PathVariable String name) {
		return "Hello " + name + ", I hope all is well today.";
	}
}
