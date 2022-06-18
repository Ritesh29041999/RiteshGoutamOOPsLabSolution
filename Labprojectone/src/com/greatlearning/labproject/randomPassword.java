package com.greatlearning.labproject;
import java.util.Random;

public class randomPassword {
	
	public void generate() {
		
		String upper = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
		String lower= "abcdefghijklmnopqrstuvwxyz";
		String special = "!@#$%^&*()+=[]:";
		String numbers = "1234567890";
		String combine = upper+lower+special+numbers;
		int length=11;
		char password[] = new char [length];
		Random random = new Random();
		
		for (int i = 0; i<length; i++) {
			password[i]= combine.charAt(random.nextInt(combine.length()));
		}
		System.out.println("Password  :"+new String(password));
	}
			
	}
	

	