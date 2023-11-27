package com.example.demo.controller;

import org.springframework.web.bind.annotation.RequestMapping;

public class DemoController {
	@RequestMapping("/text")  
	public String hello()   
	{  
	return "Hello javaTpoint";  
	}  
	}  