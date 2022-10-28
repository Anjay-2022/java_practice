package day2;

import java.util.Scanner;

public class SumFor {
	     public static void main(String[] args)
{
	    	 Scanner sc = new Scanner(System.in);
	 		System.out.println("enter nth number");
	 		int num = sc.nextInt();
	 				
	int sum=0;
	
	for(int i=1;i<=num;i++)
	{
		sum=sum+i;
	}

       System.out.println("Sum if n natural numbers is :"+sum);
    

}
}