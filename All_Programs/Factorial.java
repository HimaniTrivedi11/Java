import java.util.*;
class Fact
{
    Scanner sc=new Scanner(System.in);
    int no;
    Fact()
    {
        no=sc.nextInt();
        int fact=1;
        for(int i=1;i<=no;i++)
        {
            fact=fact*i;
        }
        System.out.println("factorial is:"+fact);
    }
}
class Factorial{
    public static void main(String args[])
    {
        Fact f=new Fact();

    }
}