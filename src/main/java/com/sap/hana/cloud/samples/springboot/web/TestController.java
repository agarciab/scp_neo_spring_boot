package com.sap.hana.cloud.samples.springboot.web;

import org.springframework.context.annotation.Scope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Scope("request")
@RequestMapping("/test")
public class TestController {
	
	@GetMapping("/hello")
	public String ldap() {
		return "Hello!";
	}

}
