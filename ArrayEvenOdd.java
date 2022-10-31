package assignment;

import java.util.Scanner;

public class ArrayEvenOdd {

	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("enter limit of array");
	int range = sc.nextInt();
	int[] arr = new int[range];
	//arr[0]=1;
	//arr[1]=2;
	//arr[2]=3;
	//arr[3]=4;
	//arr[4]=5;
	//arr[5]=6;
	System.out.println("enter values of array");
	for(int i=0;i<range;i++)
	{
		arr[i] = sc.nextInt();
	}
	for(int i=0;i<range;i++)
	{
		if(arr[i]%2 == 0) { 
		System.out.println(+arr[i]);
		} //else {
			//System.out.println("Odd  :"+arr[i]);
		//}
	}
	}

}
