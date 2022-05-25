package com.inti.Spring_TEST_td2.service;

import java.util.List;

import com.inti.Spring_TEST_td2.model.Employe;
import com.inti.Spring_TEST_td2.repository.EmployeRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EmployeServiceImpl implements EmployeService
{

	@Autowired
	EmployeRepository employeRepository;
	
	@Override
	public void saveEmploye(Employe e) 
	{
		employeRepository.save(e);
		
	}

	@Override
	public List<Employe> getEmployes() 
	{
		
		return employeRepository.findAll();
	}

}
