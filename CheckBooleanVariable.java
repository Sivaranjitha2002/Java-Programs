import java.util.*;
class main{
         public static void main(String kj[]){
                 boolean first;
                 boolean second;
                 boolean third;
                 boolean result;
                 Scanner s=new Scanner(System.in);
                 System.out.println("Enter First Boolean Value :");
                 first=s.nextBoolean();
                 System.out.println("Enter Second Boolean Value :");
                 second=s.nextBoolean();
                 System.out.println("Enter Third Boolean Value :");
                 third=s.nextBoolean();
                 if(first)
                       result=second || third;
                 else
                       result=second && third;
                if(result)
                       System.out.println("Boolean variables are true");
                else
                         System.out.println("Boolean variables are not true");
         }
}