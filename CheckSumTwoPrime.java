import java.io.*;
import java.util.*;
public class SumTwoPrime{
    public static void main(String a[])throws Exception{
        int i=1,j=0,choice=0,l,k=0;
        
        int h[]=new int[100];
        Scanner s=new Scanner(System.in);
        System.out.print("Enter the Number:");
        l=s.nextInt();
        while(i<=l){
            choice=0;
            for(j=2;j<i;j++){
                if(i%j==0)
                   choice=1;
            }
            if(choice==0)
                 h[k++]=i;
            i++;
        }
      //  System.out.println(k);
        for(i=0;i<k;i++){
            
            for(j=0;j<k;j++){
                choice=h[i]+h[j];
                if(choice==l){
                    break;
                }
            }
            if(choice==l)
                break;
        }
        if(i==k)
            System.out.println("Not a Sum of Two Prime Number");
        else
            System.out.println("Sum of Two Prime Number "+h[i]+" and "+h[j]);
        
        
    }
}
