import java.util.*;
public class sd{
    public static void main(String r[]) throws Exception{
        int i,n=0;
        double SD=0.0,mean=0.0,sum=0.0;
        Scanner s=new Scanner(System.in);
        System.out.print("Enter the Limit: ");
        n=s.nextInt();
        int a[]=new int[n];
        System.out.print("Enter the values: ");
        for(i=0;i<n;i++){
            a[i]=s.nextInt();
        }
        for(double j:a){
            sum+=j;
        }
        mean=sum/n;
        for(double j:a){
            SD+=Math.pow(j-mean,2);
        }
        System.out.print("Standard Deviation: "+Math.sqrt(SD/n));
       
    }
}
