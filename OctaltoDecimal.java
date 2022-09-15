import java.util.*;
public class OctaltoDecimal{
    public static void main(String a[]) throws Exception{
        int m,i,j;
        Scanner s=new Scanner(System.in);
        System.out.print("Enter the Octal Number: ");
        m=s.nextInt();
        i=OtoD(m);
        System.out.println("Decimal Number: "+i);
    }
    public static int OtoD(int m){
        int i=0,j=0;
        while(m>0){
            j+=(m%10)*Math.pow(8, i);
            i++;
            m/=10;
        }
        return j;
    }
}
