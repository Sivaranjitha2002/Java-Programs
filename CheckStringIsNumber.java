import java.util.*;
public class main{
    public static void main(String a[]) throws Exception{
        Scanner s=new Scanner(System.in);
        System.out.print("Enter the String:");
        String str=s.nextLine();
        boolean num=true;
        try{
            int d=Integer.parseInt(str);
            System.out.println("Given String is Number");
        }
        catch(NumberFormatException e){
            System.out.println("Given String is Not a Number");
        }
    }
}
