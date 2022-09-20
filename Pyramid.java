import java.util.*;
public class Pyramid{
    public static void main(String dd[])throws Exception{
        Scanner s=new Scanner(System.in);
        System.out.println("Enter the Limit:");
        int n=s.nextInt();
        for(int i=n;i>=1;i--){
            for(int sp=1;sp<=n-i;sp++){
                System.out.print("  ");
            }
            System.out.print(" ");
            for(int j=i;j<=2*i-1;j++){
                System.out.print(" *");
            }
            
            for(int j=0;j<i-1;j++){
                System.out.print("* ");
            }
             System.out.print("\n");
        }
    }
}
