import java.util.*;
import java.io.*;
public class LargeElement{
    public static void main(String k[]) throws Exception{
         int a[]=new int[50];
         Scanner s=new Scanner(System.in);
         System.out.println("Enter the Limit:");
         int n=s.nextInt();
         System.out.println("Enter the values:");
         for(int i=0;i<n;i++)
             a[i]=s.nextInt();
         float h=0;
         for(int i=0;i<n;i++){
                  h+=a[i];
         }
         System.out.format("Average:%.2f ",(h/n));
        
    }
}
