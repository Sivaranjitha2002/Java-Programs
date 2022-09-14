import java.util.*;
public class main{
    public static void main(String a[]){
        Scanner s=new Scanner(System.in);
        System.out.print("Enter the Binary Number: ");
        long n1=s.nextInt();
        int r=BinarytoHex(n1);
        System.out.println("GCD: "+r);
    }
    public static int BinarytoHex(long n2){
        int i=0,j=0;
        long r;
        while(n2!=0){
            r=n2%10;
            n2/=10;
            j+=r*Math.pow(2, i);
            i++;
        }
        return j;
    }
}
