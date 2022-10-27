package day2;

public class RevFOR {
	public static void main(String[] args)
	{
	int rev=0;
	int num=46;
	
	for(int i=num;i>0;i=i/10)
	{			
		rev=(rev*10)+(i%10);
	}	
	System.out.println("reverse is :"+rev);		
}
}
