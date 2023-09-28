package com.obrs.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor


public class Customer {
	private int customerId;
	private String firstName;
	private String lastName;
	private String email;
	private String gender;
	private long phonenumber;
	private int age;
	private String userName;
	private String password;
	
}
