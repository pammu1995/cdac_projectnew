package org.example.myproj;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
@RestController
public class IndexController {
	@GetMapping({"/","/hello"})
	public String hello() {
		return "Hello";
	}
}
