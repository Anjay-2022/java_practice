package day2;

import java.util.Scanner;

public class RevFOR {
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("enter a number");
		int num = sc.nextInt();
		
	int rev=0;
	
	
	for(int i=num;i>0;i=i/10)
	{			
		rev=(rev*10)+(i%10);
	}	
	System.out.println("reverse is :"+rev);		
}
}
