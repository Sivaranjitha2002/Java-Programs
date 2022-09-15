import java.util.*;
public class FactorialRecursion{
    public static void main(String a[]) throws Exception{
        int m,i,j;
        Scanner s=new Scanner(System.in);
        System.out.print("Enter the Number: ");
        m=s.nextInt();
        i=Fact(m);
        System.out.println("Factorial: "+i);
    }
    public static int Fact(int m){
        if(m==0 || m==1)
            return 1;
        else
            return (m*Fact(m-1));
    }
}
