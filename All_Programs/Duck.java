import java.util.*;
class Duck{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Number:");
        int n=sc.nextInt();
        int m;
        int i=0;
        while(n>0)
        {
            m=n%10;
            if(m==0)
            i++;
            n=n/10;
        }
        if(i>0)
        {
            System.out.println("duck number");
        }
        else{
            System.out.println(" not duck number");
        }
    }
}