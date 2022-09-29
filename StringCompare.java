import java.util.*;
public class CompareStrings {

    public static void main(String[] args) {

        Scanner s=new Scanner(System.in);
        System.out.println("Enter the String1:");
        String style =s.nextLine();
        System.out.println("Enter the String2:");
        String style2 = s.nextLine();

        if(style.equals(style2))
            System.out.println("Equal");
        else
            System.out.println("Not Equal");
    }
}
