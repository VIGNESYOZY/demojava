package com.soprasteria.devops.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.soprasteria.devops.model.BaseObj;

@RestController
public class CommonController {
	
	@GetMapping(value="/hello-world")
	public BaseObj helloWorld() {
		
		return new BaseObj("2034", "DEVOPS Accelerator", "Yozy Technologies LLP");
	}
	@GetMapping(value="/hello-world/yozyme")
	public BaseObj Aravind() {
		
		return new BaseObj("2033", "DEVOPS Accelerator", "Yozy Technologies LLP India Devozy ");
	}
	@GetMapping(value="/yozyme")
	public BaseObj Kumar() {
		
		return new BaseObj("2031", "DEVOPS Accelerator", "Yozy Technologies");
	}
	@GetMapping(value="/pr-test")
	public BaseObj pr() {
		
		return new BaseObj("2025", "DEVOPS Accelerator", "Pull Request final test");
	}

}
