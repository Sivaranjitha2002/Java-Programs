import java.util.*;
import java.io.*;
public class LargeElement{
    public static void main(String k[]) throws Exception{
         Scanner s=new Scanner(System.in);
         System.out.println("Enter the Power Value:");
         int p=s.nextInt();
         System.out.println("Enter the Base Value:");
         int b=s.nextInt();
         System.out.print("Result: "+power(b,p));
    }
    public static int power(int b,int p){
        if(p<=0)
             return 1;
        else
             return (b*power(b,p-1));
    }
}
