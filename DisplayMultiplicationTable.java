import java.util.*;
public class prime{
    public static void main(String a[]){
        int i,j,k,l=0;
        Scanner s=new Scanner(System.in);
        System.out.print("Enter the Order of table :");
        k=Integer.parseInt(s.nextLine());
        for(i=1;i<21;i++){
            System.out.print(i+"*"+k+"="+(i*k)+"\n");
            
        }
        
    }
}
