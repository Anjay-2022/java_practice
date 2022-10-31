package assignment;

import java.util.Scanner;

public class PrintForwardReverseArray {

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
		System.out.println("Print array in forward direction");
		System.out.println();
		for(int i=0;i<range;i++)
		{
			System.out.print(arr[i]); 
		}
		System.out.println();
		System.out.println("Print array in Reverse direction");
		System.out.println();
		for(int i=range-1;i>=0;i--)
		{
			System.out.print(arr[i]);
		}

	}

}
