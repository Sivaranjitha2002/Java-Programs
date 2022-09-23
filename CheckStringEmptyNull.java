import java.util.*;
public class main{
    public static void main(String h[]){
        Scanner s=new Scanner(System.in);
        String a=null;
        System.out.print("Enter the String:");
        String str=s.nextLine();
        System.out.println(isNullEmpty(str));
        System.out.println("String a is "+isNullEmpty(a));
    }
    public static String isNullEmpty(String str){
        if(str==null)
             return "NULL";
        else if(str.isEmpty())
             return "EMPTY";
        else 
             return "Not Empty";
    }
}
