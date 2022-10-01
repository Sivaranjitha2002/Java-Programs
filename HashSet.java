import java.util.*;
public class HashSet{
    public static void main(String t[]){
        int n;
        Scanner ss=new Scanner(System.in);
        System.out.println("Enter the limit:");
        n=ss.nextInt();
        String[] s=new String[n];
        System.out.println("Enter the values:");
        for(int i=0;i<n;i++){
            s[i]=ss.nextLine();
        }
        Set<String> m = new LinkedHashSet<>(Arrays.asList(s));
        System.out.println("Set: "+m);
    }
}
