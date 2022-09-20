import java.util.*;
public class Complex{
    double r,img;
    public Complex(double r,double img){
        this.r=r;
        this.img=img;
    }
    public static void main(String ii[]) throws Exception{
        Scanner s=new Scanner(System.in);
        System.out.print("Enter the complex Number1 real part: ");
        double c1=s.nextDouble();
         System.out.print("Enter the complex Number1 Imaginery part: ");
        double c11=s.nextDouble();
        System.out.print("Enter the complex Number2 real part: ");
        double c2=s.nextDouble();
        System.out.print("Enter the complex Number2 Imaginery part: ");
        double c22=s.nextDouble();
        Complex com1=new Complex(c1,c11),com2=new Complex(c2,c22),c3;
         System.out.printf("Complex Number1 = %.1f + %.1fi\n", com1.r, com1.img);
        System.out.printf("Complex Number2 = %.1f + %.1fi\n", com2.r, com2.img);
        c3=add(com1,com2);
        System.out.printf("Sum = %.1f + %.1fi", c3.r, c3.img);
    }
    public static Complex add(Complex c1,Complex c2){
        Complex com3=new Complex(0.0,0.0);
        com3.r=c1.r+c2.r;
        com3.img=c1.img+c2.img;
        return com3;
        
    }
}
