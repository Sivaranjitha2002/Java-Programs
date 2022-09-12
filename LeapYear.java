import java.util.*;
public class Year{
    public static void main(String a[]){
        int i,j,k,l=0;
        Scanner s=new Scanner(System.in);
        System.out.print("Enter the Year:");
        k=Integer.parseInt(s.nextLine());
        if(k%4==0 && k%100!=0)
             System.out.print("Leap Year");
        else if(k%100==0 && k%400==0)
             System.out.print("Leap year");
        else 
             System.out.print("Not a Leap Year");
        
    }
}
