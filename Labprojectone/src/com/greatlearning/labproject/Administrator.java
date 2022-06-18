package com.greatlearning.labproject;
import java.util.Scanner;


public class Administrator {
	
	
	public static void main(String[] args) {
    
	String name;
	Scanner in = new Scanner(System.in);
	System.out.println("Enter Your First and Last Name ");
    name=in.nextLine();
    System.out.println();
	System.out.println("Enter Your Department from the following ");
	System.out.println();
	System.out.println("Enter [ 1 ]: Technical Department");
	System.out.println("Enter [ 2 ]: Admin Department");		         
	System.out.println("Enter [ 3 ]: Human Resource Department");	         
	System.out.println("Enter [ 4 ]: Legal Department");
	int userInput= in.nextInt();
	
	if (userInput>0 && userInput<=4) {
	
	String splitname[]= name.split(" ");
	System.out.println("Hello "+splitname[0]+" Your generated credentials are as follows :");
	switch(userInput) {
	case 1:
		System.out.println("Email  : "+splitname[0]+splitname[1]+".Tech.@gmail.com");
		break;
	case 2:
		System.out.println("Email  : "+splitname[0]+splitname[1]+".Admin.@gmail.com");
		break;
	case 3:
		System.out.println("Email  : "+splitname[0]+splitname[1]+".HR.@gmail.com");
		break;
	case 4:
		System.out.println("Email  : "+splitname[0]+splitname[1]+"Legal.@gmail.com");
		break;
	default:
		System.out.println("Invalid Input");
	}
	randomPassword objectgenerate = new randomPassword();
	objectgenerate.generate();
	}
	else {
		
		System.out.println("Invalid input Please try again");
	}
	
}	
}


	

