import java.util.*;

class Buzz_no
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);

		System.out.print("Enter Number:");
		int no=sc.nextInt();

		if (no%10==7 || no%7==0) 
		{
			System.out.println(no+" is Buzz Number");			
		}		
		else
		{
			System.out.println(no+" is not Buzz Number");			
		}
	}
}