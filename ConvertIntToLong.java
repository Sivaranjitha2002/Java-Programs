import java.util.*;
public class CovertIntToLong{
    public static void main(String kk[]) throws Exception{
        Scanner s=new Scanner(System.in);
        System.out.println("Enter the value1: ");
        int k1=s.nextInt();
        System.out.println("Enter the value2: ");
        int k2=s.nextInt();
        // using valueOf() function
        long l1=Long.valueOf(k1);
        long l2=Long.valueOf(k2);
        // using type casting
        long ll1=k1;
        long ll2=k2;
        System.out.println("Long values in type casting:"+l1+" "+l2+"\nValueOf() function:"+ll1+" "+ll2);
    }
}