package day2;

public class Reverse {
	public static void main(String[] args)
	{
	int rev=0;
	int num=46;
	
	while(num>0) {			
		rev=(rev*10)+(num%10);
	     num=num/10;
			}	
	System.out.println("sum is :"+rev);		
}

}
