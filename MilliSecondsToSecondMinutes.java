import java.util.concurrent.TimeUnit;
import java.util.*;
public class main{
    public static void main(String h[]){
        Scanner s=new Scanner(System.in);
        System.out.print("Enter Milliseconds: ");
        long a=s.nextLong();
        long sec=TimeUnit.MILLISECONDS.toSeconds(a);
        long mini=TimeUnit.MILLISECONDS.toMinutes(a);
        System.out.println("Seconds : "+sec+"\nMinutes : "+mini);
    }
}
