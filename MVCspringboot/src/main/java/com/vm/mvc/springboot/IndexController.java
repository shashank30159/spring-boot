package com.vm.mvc.springboot;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class IndexController {
	@RequestMapping("/books/{name}/{course}")
	public String hello(@PathVariable("name") String name,@PathVariable("course") String course) {
		return "hello shashank books\t"+name+"\t"+course;
	}
}
