// import java.util.*;

// class Sum 
// {
//     int no;
//     Scanner sc = new Scanner(System.in);
//     Sum()
//     {
//        System.out.print("Enter a number to calculate factorial: ");
//        no=sc.nextInt();
//     }   
//     void Calculate() {
//         int factorial = 1;
//         for (int i = 1; i <= no; i++)
//         {
//             factorial *= i;
//         }
//         //return factorial;
//          //int number = sc.nextInt();

//         Sum fact = new Sum(number);
        
//         int result = fact.Calculate();

//         System.out.println("Factorial of " + no + " is: ");
//     }
// }

// public class Fact {
//     public static void main(String[] args) {
        
//         Sum s=new Sum();
//         s.Calculate();
       
//     }
// }

import java.util.*;

class Sum 
    {
    
    int no;
    Scanner sc = new Scanner(System.in);

    Sum() 
    {
        System.out.print("Enter a number: ");
        no = sc.nextInt();
    }

    int calculate() {
        int factorial = 1;
        for (int i = 1; i <= no; i++) {
            factorial *= i;
        }
        return factorial;
    }
}

public class Fact {
    public static void main(String[] args) {
        Sum s = new Sum();
        int result = s.calculate();
        System.out.println("Factorial of " + s.no + " is: " + result);
    }
}
