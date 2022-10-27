package day2;

import java.util.Scanner;

public class SpringSeason {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter date and month");
		int date = sc.nextInt();
		int month = sc.nextInt();
		
		 if(date>=20 && month==3)
		    {System.out.println("day is  in range");
		    	}  
		    else if(month==4 || month==5)
		    {System.out.println("day is in range");
			}
		    else if(date<=20 && month==6)
		    {System.out.println("day is in range");
			}
		    else
		    {System.out.println("day is not in range");
			}
		

}}
