import java.util.*;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
public class StringToDate{
    public static void main(String t[]) throws Exception{
        Scanner s=new Scanner(System.in);
        System.out.println("\t\t-------Char To Array Conversion--------");
        System.out.print("Enter char:");
        char a=s.next().charAt(0);
        System.out.println("Converted  "+Character.toString(a));
        System.out.println("\t\t-------CharArray To String Conversion--------");
        System.out.print("Enter 5 array of char:");
        char[] a1=new char[6];
        for(int i=0;i<5;i++)
        a1[i]=s.next().charAt(0);
        System.out.println("Array "+a1);
        System.out.println("String  "+String.valueOf(a1));
        System.out.println("\t\t-------String To CharArray Conversion--------");
        System.out.print("Enter String:");
        String a2=s.nextLine();
        char c[]=a2.toCharArray();
        System.out.println("Char Array: "+c);
        System.out.println(Arrays.toString(c));
    }
}
