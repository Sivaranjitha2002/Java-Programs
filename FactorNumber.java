import java.io.*;
import java.util.*;
public class Factor{
    public static void main(String a[])throws Exception{
        int i=1,j=0,k,l,h;
        Scanner s=new Scanner(System.in);
        System.out.print("Enter the Number:");
        l=s.nextInt();
        System.out.print("Factors:");
        while(i<=l){
            if(l%i==0)
                System.out.print(i+" ");
            i++;
        }
        
    }
}
