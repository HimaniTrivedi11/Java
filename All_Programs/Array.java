import java.util.*;
import java.util.Scanner;
public class Array {
    public static void main(String args[])
    {
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter size of array:");
        int n=sc.nextInt();

        System.out.println("Enter elements:");
        int a[]=new int[n+1];
        
        for(int i=0;i<n;i++)
        {
            a[i]=sc.nextInt();
        }        
        System.out.println("Enter element you want to insert:");
        int z=sc.nextInt();
        System.out.println("Enter position:");
        int pos=sc.nextInt();

        for(int i=n;i>pos;i--)
        {
            a[i]=a[i-1];
        }
        a[pos]=z;
        n++;
        
        for(int i=0;i<n;i++)
        {
            System.out.print(a[i]+" ");
        }
    }
}
