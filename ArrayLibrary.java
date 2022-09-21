import java.util.*;
public class SpaceRemover{
    public static void main(String t[]) throws Exception{
        Scanner s=new Scanner(System.in);
        int[][] b={{1,2,3},{4,5,6},{7,8,9}};
        System.out.print("Enter the limit: ");
        int n=s.nextInt();
        int[] a=new int[n];
        System.out.print("Enter the values: ");
        for(int i=0;i<n;i++){
            a[i]=s.nextInt();
        }
        for(int j:a)
            System.out.println(j);
        System.out.println(Arrays.toString(a));
        System.out.println(Arrays.deepToString(b));
    }
}
