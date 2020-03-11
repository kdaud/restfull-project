package com.example.demo;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ProgramResource {
	
	@RequestMapping("programmer")
	public List<Programmer> getProgrammers() {
		List<Programmer> programmer = new ArrayList<Programmer>();
		Programmer a1 = new Programmer();
		a1.setId(10);
		a1.setName("Daud Kakumirizi");
		a1.setCourse("Software Engineering");
		Programmer a2 = new Programmer();
		a2.setId(11);
		a2.setName("B. Fernandez");
		a2.setCourse("BSN");
		
		Programmer a3 = new Programmer();
		a3.setId(14);
		a3.setName("Gama Richard");
		a3.setCourse("BNF");
		
		programmer.add(a1);
		programmer.add(a2);
		programmer.add(a3);
		return programmer;
	}
}
