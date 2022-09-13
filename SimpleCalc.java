import java.io.*;
import java.util.*;
public class SimpleCalc{
    public static void main(String a[])throws Exception{
        int i=1,j=0,choice,l,h;
        Scanner s=new Scanner(System.in);
        System.out.print("Enter the Number1:");
        l=s.nextInt();
        System.out.print("Enter the Number2:");
        h=s.nextInt();
        System.out.print("Choose the operators: +,-,*,/\n");
        choice=s.next().charAt(0);
        switch(choice){
            case '+':System.out.println("Addition is :"+(l+h));
                     break;
            case '-':System.out.println("Subtraction is :"+(l-h));
                     break;
            case '*':System.out.println("Multiplication is :"+(l*h));
                     break;
            case '/':System.out.println("Division is :"+(l/h));
                     break;
        }
        
    }
}
