import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
public class cal{
    public static void main(String a[]){
        List<String> l1=new ArrayList<String>();
        Scanner s=new Scanner(System.in);
         System.out.println("Enter the Number of String you want add List: ");
        int n=s.nextInt();
        for(int i=0;i<n;i++)
           l1.add(s.nextLine());
        String[] s1=new String[n];
        l1.toArray(s1);
        System.out.println("List Values are: "+l1);
        System.out.println("Converted Array is: ");
        for(int i=0;i<n;i++)
        System.out.println(s1[i]+" ");
    }
}
