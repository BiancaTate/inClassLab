package javaVariables;

import java.util.*;

public class Main {
	public static void main( String[]args) {
		
		Scanner input= new Scanner (System.in); 
		int number; 
		int number2;
		String word;
	
		System.out.print("Enter in a word or phrase:");
		word= input.nextLine();
		
		System.out.print("Here is your statmenent without extra any extra space on both ends:" );
		System.out.println(word.trim());
		
		System.out.print("Here is your statement in all lowercase letters: ");
		System.out.println(word.toLowerCase());
		
		System.out.print("Here is your statement in all uppercase letters: ");
		System.out.println(word.toUpperCase());
		
		System.out.print("Here is the integer value of the length of your statement: ");
		System.out.println(word.length());
		
		System.out.print("If there are any letter o's in your statement, Here they will be replaced with the letter y: ");
		System.out.println(word.replace('o', 'y'));
		System.out.println();


	
		
		
		System.out.print("Enter an integer:  ");
		number = input.nextInt();
		
		System.out.print("Enter another integer:  ");
		number2 = input.nextInt();
		
		
		System.out.println("The SUM of " + number + " and " + number2 + " equals: "+ (number+number2));
		System.out.println("The DIFFERENCE of " +number+ " and " +number2+ " equals: "+(number-number2));
		System.out.println("The PRODUCT of " + number+ " and " + number2+ " equals: " + (number*number2));
		System.out.println("The Quotient of " + number+ " divided by " + number2 + " equals: " +(number/number2));
		System.out.println("The MODULUS of " + number+ " and " + number2+ " equals: " + (number%number));
		
		
		
		
		
		input.close();
		
		
		
		
	}
	
	
	

}
