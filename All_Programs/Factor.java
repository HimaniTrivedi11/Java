import java.util.*;
class One{
    Scanner sc = new Scanner(System.in);
    One()
    {
        System.out.println("Enter Number:");
        int no=sc.nextInt();
        for(int i=1;i<=no;i++)
        {
            if(no % i==0){
                System.out.println("Factor of "+no+":"+i);
            }
        }
    }
}
class Factor{
    public static void main(String args[]){
        One o=new One();
    }
}