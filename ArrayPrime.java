package assignment;

import java.util.Scanner;

public class ArrayPrime {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter limit of array");
		int range = sc.nextInt();
		int[] arr = new int[range];
		int count;
		System.out.println("enter values of array");
		for(int i=0;i<range;i++)
		{
			arr[i] = sc.nextInt();
		}
		for(int i = 0;i<range;i++)
		{
			if(arr[i]==2)   {
				System.out.println("2");
				continue;
			} else if(arr[i]==3) {
				System.out.println("3");
				continue;
			}
			count=0;
			for(int j = 2;j<=arr[i]/2;j++)
			{
				if(arr[i]%j == 0) {
					count++;
				}
			}
			if (arr[i] == 1) {
				continue;
			} else if (count ==0) {
				System.out.println(arr[i]);
			}
		}
	}
}
