import java.util.*;
import java.util.Scanner;
public class Armstrong{
    public static void main(String args[]){
       int m,n;
        Scanner sc=new Scanner(System.in);
        System.out.println("enter:");
        n=sc.nextInt();
        int sum=0;
        int temp=n;
        while(n>0)
        {
         m=n%10;
         sum=sum+(m*m*m);
         n=n/10;
        }
        if(temp==sum){
         System.out.println("this is armstrong number");
        }
        else{
         System.out.println("this is not armstrong number");
       }
     }
}