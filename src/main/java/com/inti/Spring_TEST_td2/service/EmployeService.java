package com.inti.Spring_TEST_td2.service;

import java.util.List;

import com.inti.Spring_TEST_td2.model.Employe;



public interface EmployeService 
{
	void saveEmploye(Employe e);
	List<Employe> getEmployes();
}
