import java.util.*;
class Process
{
	Scanner sc=new Scanner(System.in);
	int no,sqr,s_r,temp,count=0;

	Process()
	{
		System.out.println("Enter Number:");
		no=sc.nextInt();
	}
	void Perform()
	{
		temp=no;
		sqr=temp*temp;
		while(temp>0)
		{
			temp=temp/10;
			count++;
		}

		s_r=sqr%(int)Math.pow(10,count);

		if(s_r==no)
		{
			System.out.println("Number is Automorphic:"+no);
		}
		else
		{
			System.out.println("Number is not Automorphic:"+no);	
		}
	}
}

class Auto
{
	public static void main(String[] args) {
		Process p=new Process();
		p.Perform();
	}
}