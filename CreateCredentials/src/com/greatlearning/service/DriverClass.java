package com.greatlearning.service;

import java.util.Scanner;

import com.greatlearning.model.Employee;

public class DriverClass {

	public static void main(String[] args) {
		
	CredentialService cs = new CredentialService();
	String generateEmailId;
	String empName;
	char[] generatePassword;
	int choice;
	
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter Your First Name: ");
	String empFirstName = sc.nextLine();

	System.out.println("enter the password of that accont");
	String empLastName = sc.nextLine();
	
	Employee emp1 = new Employee(empFirstName, empLastName);
	
	System.out.println("-----------------------------------");
	System.out.println("1. Technical");
	System.out.println("2. Admin");
	System.out.println("3. Human Resource");
	System.out.println("4. Legal");
	System.out.println("-----------------------------------");
	
	choice = sc.nextInt();
	
	switch (choice) {
	case 0:
		choice=0;
		break;
		
	case 1:	
		empName = emp1.getFirstName() + emp1.getLastName();
		generateEmailId = cs.generateEmailAddress(empName,"tech");
		generatePassword = cs.generatePassword();
		cs.showDetails(empName,generateEmailId,generatePassword);
		break;
	
	case 2:	
		empName = emp1.getFirstName() + emp1.getLastName();
		generateEmailId = cs.generateEmailAddress(empName,"admin");
		generatePassword = cs.generatePassword();
		cs.showDetails(empName,generateEmailId,generatePassword);
		break;
	case 3:	
		empName = emp1.getFirstName() + emp1.getLastName();
		generateEmailId = cs.generateEmailAddress(empName,"hr");
		generatePassword = cs.generatePassword();
		cs.showDetails(empName,generateEmailId,generatePassword);
		break;
	case 4:	
		empName = emp1.getFirstName() + emp1.getLastName();
		generateEmailId = cs.generateEmailAddress(empName,"legal");
		generatePassword = cs.generatePassword();
		cs.showDetails(empName,generateEmailId,generatePassword);
		break;
	default:
			System.out.println("Enter valid option");
			break;
	}
	}	
}
