import java.util.*;
public class fact{
    public static void main(String a[]){
        int i,l,k=1;
        Scanner s=new Scanner(System.in);
        System.out.print("Enter the Limit :");
        l=s.nextInt();
        for(i=1;i<=l;i++)
             k*=i;
        System.out.println("Factorial: "+k);
       
        
    }
}
