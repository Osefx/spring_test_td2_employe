package com.inti.Spring_TEST_td2.repository;

import com.inti.Spring_TEST_td2.model.Employe;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EmployeRepository extends JpaRepository<Employe, Integer>
{
	
}
