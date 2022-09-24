import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
public class cal{
    public static void main(String a[]){
        List<String> l1=new ArrayList<String>();
        List<String> l2=new ArrayList<String>();
        List<String> lr=new ArrayList<String>();
        Scanner s=new Scanner(System.in);
        System.out.println("Enter the List 1 value: ");
        String a1=s.nextLine();
        System.out.println("Enter the List 2 value: ");
        String a2=s.nextLine();
        l1.add(a1);
        l2.add(a2);
        lr.addAll(l1);
        lr.addAll(l2);
        System.out.println("Joined List is: "+lr);
    }
}
