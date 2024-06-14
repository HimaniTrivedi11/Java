import java.io.*;
import java.util.Scanner;

class Sub_string
{
	public static void main(String args[])throws IOException
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a sentence : ");
		String str=sc.nextLine();
		str+=" ";
		int l=str.length();
		String t=" ";
		int i,j,c=0,p=0;
		for(i=0;i<l;i++)
		{
			char ch=str.charAt(i);
			if(ch==' ')
			{
				t=str.substring(p,i+1);
 				c=0;
 				for(j=0;j<t.length();j++)
 				{
 					char k=t.charAt(j);
 					if(k=='a'||k=='e'|| k=='i' || k=='o' ||k=='u' || k=='A' || k=='E' || k=='I' || k=='O' || k=='U')
 					c++;
 				}
				System.out.println(t+"\t\t"+c);
 				p=i+1;
 			}
 		}
	} 
} +