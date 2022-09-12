import java.util.*;
public class prime{
    public static void main(String a[]){
        int i;
        char k;
        String l;
        Scanner s=new Scanner(System.in);
        System.out.print("Enter the Character :");
        l=s.nextLine();
        k=l.charAt(0);
        if((k>='a' && k<='z') || (k>='A' && k<='Z'))
             System.out.println(k+" is Alphabet");
        else
             System.out.println("Not a Alphabet");
       
    }
}
