import java.util.*;
import java.util.Scanner;

public class Arraydelete {
    public static void main(String[] args) {

        Scanner sc =new Scanner(System.in);
        System.out.println("Enter size of array:");
        int n=sc.nextInt();
        
        System.out.println("Enter elements:");
        int a[]=new int[n];
        
        for(int i=0;i<n;i++)
        {
            a[i]=sc.nextInt();
        }
        
        System.out.println("enter the element want you delete:");
        int g=sc.nextInt();
        
        for(int i=0;i<n;i++)
        {
            if(a[i]==g)
            {
                for(int j=i;j<n-1;j++){
                    a[j]=a[j+1];
                }

            }
        }    
        System.out.println("after deleting:");
        for(int i=0;i<n-1;i++)
        {
            System.out.print(a[i]+ " ");
        }
    }
}
    