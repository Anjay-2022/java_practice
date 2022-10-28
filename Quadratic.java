package day2;

import java.util.Scanner;
import java.lang.Math;

public class Quadratic {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter coefficient of x2,x,contant");
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		float delta=b*b-4*a*c;
		double x1 = (-b + Math.sqrt(delta))/(2*a);
		double x2 = (-b - Math.sqrt(delta))/(2*a);
		System.out.println(+x1);
		System.out.println(+x2);
	}

	private static int sqrt(float delta) {
		// TODO Auto-generated method stub
		return 0;
	}

}
