package com.greatlearning.service;

import java.util.Random;

public class CredentialService {
	 public char [] generatePassword() {
		String capLetter = "ABCDEFGHIJKLMNOPQRST";
		String smallLetter = "abcdefghijklmnopqrstuvwxyz";
		String numbers = "0123456789";
		String splCharector = "!@#$%^&*()";
		
		String values = capLetter + smallLetter + numbers + splCharector;
		
		Random random = new Random();
		
		char [] password = new char [8];
		
		for (int i=0;i<8;i++) {
			password[i] = values.charAt(random.nextInt(values.length()));
		}
		return password;
	 }
	 
	 public String generateEmailAddress(String empName, String department)
	 {
		 return empName+"@"+department+".abc"+".com";
	 }
	 
	 public String showDetails(String empName, String emailid, char [] password)
	 {
		 String empString = ("Dear "+empName+" your generated Credential are as follows");
		 return empString;
	 }
}
