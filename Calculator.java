package basicCalculation;

import java.util.Scanner;

public class Calculator {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("enter your option: 1 for add: /2 for sub:/ 3 for product: /4 for divide: /5 for modulus:");
		int option = sc.nextInt();
		

		System.out.println("enter your number1");
		int num1 = sc.nextInt();
		
	
		System.out.println("enter your number2");
		int num2 = sc.nextInt();
		
		float exp;
		
		
		switch(option)
		{
		case 1: exp=num1+num2;
		System.out.println("add is :"+exp);
		break;
		
		case 2: exp=num1-num2;
		System.out.println("sub is :"+exp);
		break;
		
		case 3: exp=num1*num2;
		System.out.println("product is :"+exp);
		break;
		
		case 4: exp=num1/num2;
		System.out.println("divide is : "+exp);
		break;
		
		case 5: exp=num1%num2;
		System.out.println("modulus is : "+exp);
		break;
		
		default: System.out.println("enter valid option");
		
		}
	}

}
