import java.util.*;
public class fact{
    public static void main(String a[]){
        int i,l=0,k=1,n1,n2,m=0;
        Scanner s=new Scanner(System.in);
        System.out.print("Enter the Number1 :");
        n1=s.nextInt();
        System.out.print("Enter the Number2 :");
        n2=s.nextInt();
        i=(n1>n2)?n1:n2;
        while(true){
           if(i%n1==0 && i%n2==0)
               break;
           i++;
        }
        System.out.println("LCM :"+i);
    }
}
