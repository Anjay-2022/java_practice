package assignment;

import java.util.Scanner;

public class PrintEvenOddPostion {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter limit of array");
		int range = sc.nextInt();
		int[] arr = new int[range];	   
		System.out.println("enter values of array");
		for(int i=0;i<range;i++)
		{
			arr[i] = sc.nextInt();
		}
		System.out.println("Print odd position of array ");
		System.out.println();
		for(int i=0;i<range;i+=2)
		{
			System.out.print(arr[i]); 
		}
		System.out.println();
		System.out.println("Print even position of array ");
		System.out.println();
		for(int i=1;i<range;i+=2)
		{
			System.out.print(arr[i]);
		}

	}

}
