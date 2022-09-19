import java.util.*;
public class frequency{
    public static void main(String a[]) throws Exception{
        int j=0,i;
        char k;
        Scanner s=new Scanner(System.in);
        System.out.print("Enter the Sentence:");
        String str=s.nextLine();
        System.out.print("Enter the Search Character:");
        char se=s.next().charAt(0);
        for(i=0;i<str.length();i++){
            k=str.charAt(i);
            if(k==se)
               j++;
        }
        System.out.println("Freaquency of "+se+"is: "+j);
    }
}
