import java.util.*;
class One{
    Scanner sc=new Scanner(System.in);
    int i;
    One(){
        System.out.print("Enter Number:");
        i=sc.nextInt();
        int sum=0;
        int m;
        int n=i*i;
         while(n>0)
        {
             m=n%10;
             sum=sum+m;
             n=n/10;
        }
        if(i==sum)
        {
                System.out.println("This number is neon");
        }
        else{
            System.out.println("This number is not neon");
        }
    }
}
class Neon{
    public static void main(String args[])
    {
        One o=new One();
    }
}