import java.io.*;
import java.util.*;
public class Armstrong{
    public static void main(String a[])throws Exception{
        int i=0,j=0,k,l,h;
        Scanner s=new Scanner(System.in);
        System.out.print("Enter the Lower limit:");
        l=s.nextInt();
        System.out.print("Enter the higher limit:");
        h=s.nextInt();
        k=l;
        while(k<=h){
            l=k;j=0;
            while(0<l){
                i=l%10;
                j+=(i*i*i);
                l=l/10;
            }
            if(k==j)
                System.out.println(j);
            k++;
        }
    }
}
