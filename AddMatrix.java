package assignment;

import java.util.Scanner;

public class AddMatrix {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter limit of array");
		int h = sc.nextInt();
		int v = sc.nextInt();
		int[][] arr = new int[h][v];
		int[][] arr1 = new int[h][v];
		int[][] result = new int[h][v];
		System.out.println("enter values of array1");
		for(int i=0;i<h;i++)
		{
			for(int j=0;j<v;j++)
			{
				arr[i][j] = sc.nextInt();
			}
		}
		System.out.println("enter values of array2");
		for(int i=0;i<h;i++)
		{
			for(int j=0;j<v;j++)
			{
				arr1[i][j] = sc.nextInt();
			}
		}

		for(int i=0;i<h;i++)
		{
			for(int j=0;j<v;j++)
			{
			result[i][j]=arr[i][j]+arr1[i][j];	
			}
		}
		
		for(int i=0;i<h;i++)
		{
			for(int j=0;j<v;j++)
			{
				System.out.print(result[i][j]+" ");
			} System.out.println();
		}
	}
}
