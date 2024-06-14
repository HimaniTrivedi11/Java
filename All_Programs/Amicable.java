import java.util.*;
class One{
        int count=0;
        int c=0;
        Scanner sc=new Scanner(System.in);
        One()
        {
           System.out.println("Enter first no:");
           int no=sc.nextInt();
           for(int i=1; i<=no/2; i++)
            {
                if(no%i==0)
                {
                    count=count+i;
                    
                }
            } 
            System.out.println("Enter second no:");
             int no1=sc.nextInt();
        
                for(int i=1; i<=no1/2; i++)
                {
                    if(no1%i==0)
                    {
                        c=c+i;
                    }
                }
                if(count==no1 && c==no)
                {
                    System.out.println("Amicable");
                }
                else
                {
                    System.out.println(" not Amicable");

                }
        }
}
class Amicable
{
    public static void main(String args[])
    {
       One o=new One();

    }
}