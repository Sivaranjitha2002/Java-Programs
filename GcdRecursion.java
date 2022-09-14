import java.util.*;
public class main{
    public static void main(String a[]){
        Scanner s=new Scanner(System.in);
        System.out.print("Enter the number1: ");
        int n1=s.nextInt();
        System.out.print("Enter the number2: ");
        int n2=s.nextInt();
        int r=gcd(n1,n2);
        System.out.println("GCD: "+r);
    }
    public static int gcd(int n1,int n2){
        if(n2!=0)
            return gcd(n2,n1%n2);
        else
           return n1;
    }
}
