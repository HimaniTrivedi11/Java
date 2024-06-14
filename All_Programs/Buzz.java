import java.util.*;
class User
{
    User()
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter Number:");
        int i=sc.nextInt();
        //int i=300;
        if(i%10==7||i%7==0)
        {
            System.out.println("this is buzz number");
        }
        else{
            System.out.println("this is not buzz number");
        }
    }
}
public class Buzz{
    public static void main(String args[])
    {
        User u = new User();
}
}