package day2;

import java.util.Scanner;

public class SumNnatural {
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("enter nth number");
		int num = sc.nextInt();
				
		int sum=0;
	
		
		while(num>0) {			
			sum=sum+num;
			num--;
		}	System.out.println("sum is :"+sum);		
	}

}
