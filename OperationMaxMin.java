package day2;

import java.util.Scanner;

public class OperationMaxMin {

public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("enter three number");
	int a = sc.nextInt();
	int b = sc.nextInt();
	int c = sc.nextInt();
			
    int exp1,exp2,exp3,exp4;
    exp1=a+b*c;System.out.println(+exp1);
    exp2=c+a/b;System.out.println(+exp2);
    exp3=a%b+c;System.out.println(+exp3);
    exp4=a*b+c;System.out.println(+exp4);
    
    if(exp1>exp2 && exp1>exp3 && exp1>exp4)
    {System.out.println("option 1 is greater");
    	}  
    else if(exp2>exp1 && exp2>exp3 && exp2>exp4)
    {System.out.println("option 2 is greater");
	}
    else if(exp3>exp1 && exp3>exp2 && exp3>exp4)
    {System.out.println("option 3 is greater");
	}
    else if(exp4>exp1 && exp4>exp2 && exp4>exp3)
    {System.out.println("option 4 is greater");
	}
    }
}
