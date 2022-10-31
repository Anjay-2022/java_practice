package assignment;

import java.util.Scanner;

public class ArrayShort {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter limit of array");
		int range = sc.nextInt();
		int[] arr = new int[range];
		int swap;
		System.out.println("enter values of array");
		for(int i=0;i<range;i++)
		{
			arr[i] = sc.nextInt();
		}
		for(int i=0;i<range;i++) 
		{
			for(int j=i+1;j<range;j++)
			{
				if(arr[j]<=arr[i]) {
					swap=arr[i];
					arr[i]=arr[j];
					arr[j]=swap;					
				}
		    }
		}
		for(int i=0;i<range;i++)
		{
			System.out.println(arr[i]);
		}
	}
}