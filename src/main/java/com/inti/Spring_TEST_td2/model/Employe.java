package com.inti.Spring_TEST_td2.model;

import javax.persistence.*;
import lombok.*;



@Entity
@Table
@Data
@NoArgsConstructor @AllArgsConstructor @RequiredArgsConstructor
public class Employe 
{
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private @NonNull String nomEmploye;
	private @NonNull String prenomEmploye;
	private String email;
	
	
}
