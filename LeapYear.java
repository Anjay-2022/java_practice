package assignment;

import java.util.Scanner;

public class LeapYear {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter Year");
		int year = sc.nextInt();
		int century;
		century=year/100;
		if(year%4== 0) {
			if(year%100==0) {
				if(year%400==0) {
				System.out.println("Year is leap year");
				} else {
					System.out.println("NOt a leap year");
				}
			} else
			{System.out.println("Year is  leap year");}
		} else {
			System.out.println("Not a leap Year");
		}
		
	}

}
