import java.util.*;
import java.util.Scanner;
class Numberwords
{
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter the number(3-digit only)");
        int n=sc.nextInt();
        if(n<1 || n>999)
        {
            System.out.println("Wrong input");
        }
        else{
            int u=n%10;
            int tt = n/10;
            int t = tt%10;
            int h = n/100;
            String uw[] = { " ", "One","Two","Three","Four","Five","Six","Seven","Eight","Nine","Ten","Eleven","Twelve","Thirteen","Fourteen","Fifteen","Sixteen","Eighteen","Nineteen"
            };
            String tw[] ={" ","Ten","Twenty","thirty","Fourty","Fifty","Sixty","Seventy","Eighty","Ninety"};
            String hw="Hundred";
            if(n<20)
            {
                System.out.println(uw[n]);
            }
            else if(n<100){
                System.out.println(tw[t]+ " "+uw[u]);
            }
            else{
                System.out.println(uw[h]+" " + hw+tw[t]+ " "+uw[u]);
            }
        }
    }
}