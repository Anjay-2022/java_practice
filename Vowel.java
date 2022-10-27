package day2;

import java.util.Scanner;

public class Vowel {
public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("enter letter");
		char option = sc.next().charAt(0);
		
		char option1='a';
	
	switch(option)
	{
	case 'a': 
	System.out.println("vowel ");
	break;
	
	case 'e': 
	System.out.println("vowel ");
	break;
	
	case 'i': 
	System.out.println("vowel ");
	break;
	
	case 'o':
	System.out.println("vowel ");
	break;
	
	case 'u': 
	System.out.println("vowel ");
	break;
	
	default: System.out.println("consonant");
	
	}

}
}
