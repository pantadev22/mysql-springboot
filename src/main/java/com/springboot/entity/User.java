package com.springboot.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Entity
@Data
@Table(name="Users_db")
public class User {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "User_ID")
	private Long userId; 
	
	@Column(name = "User_Name")
	private String userName;
	
	@Column(name = "User_Email")
	private String email;
	
	@Column(name = "User_Contact_Number")
	private String contactNumber; 
	
	private String address;
	
	
	private String number;
	
	private String number2;

	private String number1;

	
	
	

}
