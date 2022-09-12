import java.util.*;
public class sum{
    public static void main(String a[]){
        int i,l,k=0;
        Scanner s=new Scanner(System.in);
        System.out.print("Enter the Limit :");
        l=s.nextInt();
        for(i=0;i<=l;i++)
             k+=i;
        System.out.println("Sum: "+k);
       
        
    }
}
