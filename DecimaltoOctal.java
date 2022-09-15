import java.util.*;
public class DecimaltoOctal{
    public static void main(String a[]) throws Exception{
        int m,i,j;
        Scanner s=new Scanner(System.in);
        System.out.print("Enter the Decimal Number: ");
        m=s.nextInt();
        i=DtoO(m);
        System.out.println("Octal Number: "+i);
    }
    public static int DtoO(int m){
        int i=1,j=0;
        while(m>0){
            j+=(m%8)*i;
            i*=10;
            m/=8;
        }
        return j;
    }
}
