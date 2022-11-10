import java.util.*;
class main{
      public static void main(String asd[]){
            Scanner s=new Scanner(System.in);
            String ss=s.nextLine();
            int count=1;
            String re="";
            int i=0;
            for(i=0;i<ss.length()-1;i++){
                     if(ss.charAt(i)==ss.charAt(i+1))
                           count++;
                     else{
                              re+=ss.charAt(i);
                              re+=String.valueOf(count);
                              count=1;
                     }
            }
              re+=ss.charAt(i);
              re+=String.valueOf(count);
            System.out.println("Answer : "+re);
      }
}
 