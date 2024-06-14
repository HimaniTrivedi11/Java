import java.util.*;

class Greater_no
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);

		System.out.print("Enter Number1:");
		int s1=sc.nextInt();

		System.out.print("Enter Number2:");
		int s2=sc.nextInt();

		System.out.print("Enter Number3:");
		int s3=sc.nextInt();

		if( s1 >= s2 && s1 >= s3)
            System.out.println(s1 + " is the greatest Number.");

        else if (s2 >= s1 && s2 >= s3)
            System.out.println(s2 + " is the greatest Number.");

        else
            System.out.println(s3 + " is the greatest Number.");	
	}

	}
	
