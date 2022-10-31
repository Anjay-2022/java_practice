package assignment;

import java.util.Scanner;

public class Armstrong {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Check number for armstrong");
		int num = sc.nextInt();
		int arm=0,flag;
		for(int i=num;i>0;i=i/10)
		{
			flag=i%10;
			arm=arm + flag * flag * flag;
		}	
		System.out.println(arm);	
		if (num == arm) {
			System.out.println("Armstrong");
		} else {
			System.out.println("Not armstrong");
		}
	}
}
