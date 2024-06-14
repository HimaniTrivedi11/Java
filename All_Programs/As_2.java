import java.util.*;
class Process
{
    Scanner in = new Scanner(System.in);
    int num1,num2;
    Process()
    {
        System.out.print("Input the first number: ");
        num1 = in.nextInt();
        System.out.print("Input the second number: ");
        num2 = in.nextInt();    
    }
    void Perform()
    {
        int sum_num1 = 0, sum_num2 = 0;
            for (int i = 1; i <= num1; i++) {
                if (num1 % i == 0)
                    sum_num1 += i;
            }
            for (int i = 1; i <= num2; i++) {
                if (num2 % i == 0)
                    sum_num2 += i;
            }
            if (sum_num1 == sum_num2)
                System.out.println("These numbers are amicable.");
            else
                System.out.println("These numbers are not amicable.");
                System.out.println("\n");
    }
}
public class As_2
    {
      public static void main(String args[]) {
            Process p=new Process();
        p.Perform();		
    }
}
