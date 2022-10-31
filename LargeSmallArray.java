package assignment;

import java.util.Scanner;

public class LargeSmallArray {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter limit of array");
		int range = sc.nextInt();
		int[] arr = new int[range];
		int large,small;
		System.out.println("enter values of array");
		for(int i=0;i<range;i++)
		{
			arr[i] = sc.nextInt();
		}
		large=arr[0];
		small=arr[0];
		for(int i=0;i<range;i++) 
		{
			if(arr[i]<small) {
				small=arr[i];
			} else if(arr[i]>large) {
				large=arr[i];
			}
		}
	System.out.println("largest element in array is :"+large);
	System.out.println("smallest element in array is :"+small);
	}

}
