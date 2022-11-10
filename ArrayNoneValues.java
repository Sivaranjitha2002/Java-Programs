import java.util.*;
class main{
       public static void main(String df[]){
                     Scanner s=new Scanner(System.in);
                     int[] a=new int[30];
                     int[] b=new int[30];
                     int i=0,j=0,k=0;
                     System.out.println("Limit:");
                     int n=s.nextInt();
                     for(i=0;i<n;i++)
                            a[i]=s.nextInt();
                    for(i=a[0];i<a[n-1];i++){
                            for(k=0;k<n;k++){
                                 if(i==a[k])
                                       break;
                            }
                           if(k==n)
                                  b[j++]=i;
                    }

                     System.out.println("Result: ");
                    for(i=0;i<j;i++)
                            System.out.print(b[i]);
          }
}