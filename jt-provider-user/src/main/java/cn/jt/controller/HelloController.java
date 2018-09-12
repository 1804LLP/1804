package cn.jt.controller;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
	//springCloud RESTFul+json. PathV... 后面参数必须写
	@RequestMapping("/hello/{name}")
	public String hello(@PathVariable("name") String name) {
		return "1       hello"+name;
	}
}
