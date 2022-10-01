import java.util.*;
public class HashSet{
    public static void main(String t[]){
        int n;
        Scanner ss=new Scanner(System.in);
        System.out.println("Enter the limit:");
        n=ss.nextInt();
        String[] s=new String[n];
        List<String> l1=new ArrayList<String>();
        l1.add("a");
        List<String> l2=new ArrayList<String>();
        l2.add("b");
        List<String> join=new ArrayList<String>();
        join.addAll(l1);
        join.addAll(l2);
        System.out.println("List1: "+l1);
        System.out.println("List2: "+l2);
        System.out.println("Set: "+join);
    }
}
