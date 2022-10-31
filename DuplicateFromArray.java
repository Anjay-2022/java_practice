package assignment;

import java.util.Scanner;

public class DuplicateFromArray {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter limit of array");
		int range = sc.nextInt();
		int[] arr = new int[range];
		int count,flag=-1;
		System.out.println("enter values of array");
		for(int i=0;i<range;i++)
		{
			arr[i] = sc.nextInt();
		}
		int[] d = new int[range];
		for(int i=0;i<range;i++) {
			count=0;
			for(int j=i+1;j<range;j++) {
				if(arr[i]==arr[j]) {
					count++;
					d[j]=flag;
					}
			}
			if(d[i] != flag) {
				d[i]=count+1;
				
			}
			
		}
		for(int i=0;i<range;i++) {
			if(d[i]!= flag) {
				System.out.println(arr[i]+" has frequency "+d[i]);
			}
		}
	}

}
