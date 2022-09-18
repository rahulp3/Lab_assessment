package com.greatlearning.itsupport.controller;

import java.util.Scanner;

import com.greatlearning.itsupport.model.CredentialService;
import com.greatlearning.itsupport.model.Employee;

public class Controller {

	public static void main(String[] args) {
		System.out.println("Hi!!\n"+ "Welcome to Great learning.");
		System.out.println("Please enter the following details :\n" + "First Name :");
		Scanner sc = new Scanner(System.in);
		String firstName = sc.nextLine();
		System.out.println("Last Name :");
		String lastName = sc.nextLine();
		Employee emp = new Employee(firstName, lastName);
		String value = null;
		CredentialService service = new CredentialService();
		do {
		System.out.println("Please enter the department from the following : \n"+"1. Technical \n"+"2. Admin \n"+"3. Human Resource \n"+"4. Legal\n");
		switch(sc.nextInt()){
			case 1 : value = "tech";
					 break;
			case 2 : value = "admin";
			 		 break;
			case 3 : value = "humanResource";
			 		break;
			case 4 : value = "legal";
			 		break;
			default: System.out.println("Enter a valid department value!!");
					 break;
			}
		}while(value == null);
		
		if(value != null) {
			service.showCredentials(emp.getFirstName(), emp.getLastName(), value);
		}
		sc.close();
	}

}
