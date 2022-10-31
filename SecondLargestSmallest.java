package assignment;

import java.util.Scanner;

public class SecondLargestSmallest {


	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter limit of array");
		int range = sc.nextInt();
		int[] arr = new int[range];
	    int large,large2,small,small2;
		System.out.println("enter values of array");
		for(int i=0;i<range;i++)
		{
			arr[i] = sc.nextInt();
		}
		large=arr[0];
		large2=arr[0];
		small=arr[0];
		small2=arr[0];
		for(int i=0;i<range;i++) 
		{
			if(arr[i]<small) {
				small2=small;
				small=arr[i];
			} else if(arr[i]>large) {
				large2=large;
				large=arr[i];
			} else if(arr[i]>large2) {
				large2=arr[i];
			} else if(arr[i]<small2) {
				small2=arr[i];
			}
		}
	System.out.println("largest element in array is :"+large);
	System.out.println("Second largest element in array is :"+large2);
	System.out.println("smallest element in array is :"+small);
	System.out.println("Second smallest element in array is :"+small2);

	}

}
