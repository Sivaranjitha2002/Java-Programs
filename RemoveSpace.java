import java.util.*;
public class RemoveSpace{
    public static void main(String t[]) throws Exception{
        Scanner s=new Scanner(System.in);
        System.out.print("Enter the sentece: ");
        String a=s.nextLine();
        a=a.replaceAll("\\s","");
        System.out.println(a);
    }
}
