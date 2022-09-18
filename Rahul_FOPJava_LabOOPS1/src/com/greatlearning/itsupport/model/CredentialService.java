package com.greatlearning.itsupport.model;

import java.util.Random;

public class CredentialService {
	
	public String generateEmailAddress(String firstName, String lastName,String department) {
		//Added replaceALL function to remove any spaces in the first and last name where \\s is single space
		return firstName.replaceAll("\\s", "")+lastName.replaceAll("\\s", "")+"@"+department+".greatlearning.com";
		
	}

	public String generatePassword() {
		String source = "ABCDEFGHIJKLMNOPQRSTUVWXYZ" + "abcdefghijklmnopqrstuvwxyz" + "0123456789" + "!@#$%^&*_";
		String password = "";
		Random val = new Random();
		for(int i = 0 ; i < 8 ; i++) { 
			password += source.charAt(val.nextInt(source.length()));
		}
		return password;
	}
	
	public void showCredentials(String firstName, String lastName,String department) {
		System.out.println("Dear "+firstName+" your generated credentials are as follows :\n" + "Email    ---> " +generateEmailAddress(firstName,lastName,department)+"\n"+"Password ---> " + generatePassword());
	}
}
