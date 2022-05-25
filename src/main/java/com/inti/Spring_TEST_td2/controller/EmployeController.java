package com.inti.Spring_TEST_td2.controller;

import com.inti.Spring_TEST_td2.repository.EmployeRepository;
import com.inti.Spring_TEST_td2.service.EmployeService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class EmployeController 
{

	@Autowired
	EmployeService employeService;
	@Autowired
	EmployeRepository employeRepository;
	
	
	@GetMapping("/accueil")
	public String accueil(Model m)
	{
		m.addAttribute("listeEmploye", employeService.getEmployes());
		// deux méthodes
		m.addAttribute("listeEmploye", employeRepository.findAll());
		return "accueil";
	}
}
