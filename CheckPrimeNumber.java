import java.util.*;
public class prime{
    public static void main(String a[]){
        int i,j,k,l=0;
        Scanner s=new Scanner(System.in);
        System.out.print("Enter the Number:");
        k=Integer.parseInt(s.nextLine());
        for(i=2;i<k;i++){
            if(k%i==0){
                 l=1;
                break;
            }
               
        }
        if(l==1)
            System.out.print("Not a Prime Number");
        else 
            System.out.print("Prime Number");
    }
}
