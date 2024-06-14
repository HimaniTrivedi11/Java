import java.util.*;
import java.util.Scanner;

public class Count_vowel {
    public static void main(String[] args) {
     
            Scanner sc = new Scanner(System.in);
            
            System.out.print("Enter string:");
            String s1=sc.nextLine();
            
            s1=s1.toLowerCase();
            int count=0;
        
            for(int i=0;i<s1.length();i++)
            {
                char ch=s1.charAt(i);
                if(ch =='a' || ch=='e' || ch=='i' || ch=='o'|| ch =='u' || ch=='A' || ch=='E' || ch=='I' || ch=='O' || ch=='U' ){
                    count++;
                }
            }
            System.out.println("Number of Vowels:"+ count);
         
    }
}
