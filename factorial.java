package assignment;

import java.util.Scanner;

public class factorial {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter number for factorial");
		int num = sc.nextInt();
		int fact=1;
		for(int i = num; i>0;i--) {
		 fact *= i;
		}System.out.println(fact);
	}

}
