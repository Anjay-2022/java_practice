package day2;

import java.util.Scanner;

public class UnitTenshun {
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("enter a number");
		int num = sc.nextInt();
		int unit=0;
		while(num>0) {
			unit=num%10;
			if(num>=1000) {
				System.out.println("Unit is :");word(unit);
			} else if (num>=100) {
					System.out.println("Tens is :");word(unit);
			} else if (num>=10) {
					System.out.println("Hundreds is :");word(unit);
			} else {
					System.out.println("Thousands is :");word(unit);
				}
			num=num/10;
		}			
	}
	public static void word(int option) {  
		if(option==0)
		{System.out.println("zero");}
		else if(option==1)
		{System.out.println("one");}
		else if(option==2)
		{System.out.println("two");}
		else if(option==3)
		{System.out.println("three");}
		else if(option==4)
		{System.out.println("four");}
		else if(option==5)
		{System.out.println("five");}
		else if(option==6)
		{System.out.println("six");}
		else if(option==7)
		{System.out.println("seven");}
		else if(option==8)
		{System.out.println("eight");}
		else if(option==9)
		{System.out.println("nine");}
		else
		{System.out.println("enter valid nunmber");}
	}
}
