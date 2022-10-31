package assignment;

import java.util.Scanner;

public class Prime {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Give range");
		int range = sc.nextInt();
		int flag,count;
		if(range>=3) {
			System.out.println("2");
			System.out.println("3");
			
		}
		for(int i = 4;i<=range;i++)
		{
			count=0;
			for(int j = 2;j<=i/2;j++)
			{
				if(i%j == 0) {
					count++;
				}
			}
			if (count ==0) {
				System.out.println(i);
			}
		}

	}

}
