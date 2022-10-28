package day2;

import java.util.Scanner;

public class Distance {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter coordinates");
		int x= sc.nextInt();
		int y= sc.nextInt();

		double dis;
		dis=Math.sqrt(x*x+y*y);
		System.out.println("distance from origin is : "+dis);

		

	}

	private static double sqrt(int i) {
		// TODO Auto-generated method stub
		return 0;
	}

}
