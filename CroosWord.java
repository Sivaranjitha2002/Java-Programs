import java.util.*;
class main{
          public static void main(String asd[]){
                   Scanner s=new Scanner(System.in);
                   String ss=s.nextLine();
                   int n=ss.length();
                  int m=n/2;
                  int i=0,j=0;
                   for(i=0;i<n;i++){
                        for(j=n-1;j>=0;j--){
                           if((i==(n-1)-j)|| j==i)
                                  System.out.print(ss.charAt(i));
                          else
                                 System.out.print(" ");
                       }
                       System.out.println();
                  }
           }
}
                         
                          
                                