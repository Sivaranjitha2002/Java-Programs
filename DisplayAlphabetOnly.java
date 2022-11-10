import java.util.*;
class main{
           public static void main(String kj[]){
                       Scanner s=new Scanner(System.in);
                       String ss=s.nextLine();
                       for(int i=0;i<ss.length();i++){
                            if((ss.charAt(i)>='a' && ss.charAt(i)<='z')|| (ss.charAt(i)>='A' && ss.charAt(i)<='Z'))
                                        System.out.print(ss.charAt(i));
                       }
            }
}