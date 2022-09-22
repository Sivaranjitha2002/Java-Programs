import java.util.*;
import java.math.RoundingMode;
import java.text.DecimalFormat;
public class SearchArray{
    public static void main(String dd[]) throws Exception{
        Scanner s=new Scanner(System.in);
        System.out.print("Enter the Limit for Array1:");
        int n=s.nextInt();
        int[] a1=new int[n];
        int l=0;
        for(int i=0;i<n;i++)
             a1[i]=s.nextInt();
        System.out.print("Enter the Search Number: ");
        int ss=s.nextInt();
        for(int k:a1){
            if(k==ss){
                l=1;
                break;
            }
               
        }
        if(l==1)
             System.out.print("Found");
        else
             System.out.print("Not Found");
    }
}
