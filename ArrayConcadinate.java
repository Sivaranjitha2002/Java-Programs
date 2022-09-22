import java.util.*;
import java.math.RoundingMode;
import java.text.DecimalFormat;
public class ArrayConcadinate{
    public static void main(String dd[]) throws Exception{
        Scanner s=new Scanner(System.in);
        System.out.print("Enter the Limit for Array1:");
        int n=s.nextInt();
        int[] a1=new int[n];
        for(int i=0;i<n;i++)
             a1[i]=s.nextInt();
        System.out.print("Enter the Limit for Array2:");
        int n1=s.nextInt();
        int[] a2=new int[n1];
        for(int i=0;i<n1;i++)
             a2[i]=s.nextInt();
        int[] r=new int[n+n1];
        System.arraycopy(a1,0,r,0,n);
        System.arraycopy(a2,0,r,n,n1);
        for(int k:r)
           System.out.print(k+" ");
        
    }
}
