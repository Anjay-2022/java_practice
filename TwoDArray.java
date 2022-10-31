package assignment;

import java.util.Scanner;

public class TwoDArray {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter limit of array");
		int h = sc.nextInt();
		int v = sc.nextInt();
		int[][] arr = new int[h][v];
		int[][] arr1 = {{1,2,3},{4,5,6},{7,8,9}};
		System.out.println("enter values of array");
		for(int i=0;i<h;i++)
		{
			for(int j=0;j<v;j++)
			{
				arr[i][j] = sc.nextInt();
			}
		}


		for(int i=0;i<h;i++)
		{
			for(int j=0;j<v;j++)
			{
				System.out.print(arr[i][j]+" ");
			} System.out.println();
		}
		System.out.println("previuosly defined array");
		for(int i=0;i<arr1.length;i++)
		{
			for(int j=0;j<arr1.length;j++)
			{
				System.out.print(arr1[i][j]+" ");
			} System.out.println();
		}

	}

}


