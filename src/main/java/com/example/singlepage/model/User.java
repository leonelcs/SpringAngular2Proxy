package com.example.singlepage.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.Data;

@Entity
@Data
public class User {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	Long id;
	
	String name;
	
	String surname;
	
	public User() {}
	
	public User(String name, String surname) {
		this.name = name;
		this.surname = surname;
	}

}
