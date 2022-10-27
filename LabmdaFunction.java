import java.util.Arrays;
import java.util.ArrayList;
class main{
         public static void main(String aa[]){
                   ArrayList<String> a=new ArrayList<>(Arrays.asList("hii","hello"));
                   System.out.println("The List is :"+a);
                   a.replaceAll(e -> e.toUpperCase());
                   System.out.println("Covert UpperCase : "+a);
                   System.out.println("The Reversed List is :");
                   a.forEach((e)->{
                                       String r="";
                                       for(int i=e.length()-1;i>=0;i--){
                                                  r+=e.charAt(i);
                                       }
                                       System.out.print(r+", ");
                     });
          }
}