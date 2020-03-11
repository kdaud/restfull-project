package com.example.demo;

import java.util.List;

import org.springframework.web.bind.annotation.RestController;

@RestController
public class ProgramResource {
	
	public List<Programmer> getProgrammer() {
		return new Programmer();
	}
}
