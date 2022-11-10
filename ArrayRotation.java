import java.util.*;
class main{
           public static void main(String asdf[]){
                     Scanner s=new Scanner(System.in);
                     int n=s.nextInt();
                     int[] a=new int[30];
                    int j=0,t=0;
                     for(int i=0;i<n;i++)
                            a[i]=s.nextInt();
                    int k=s.nextInt();
                     for(int i=0;i<k;i++){
                                t=a[n-2];
                                for(j=n-2;j>1;j--)
                                         a[j]=a[j-1];
                                a[1]=t;
                     }
                     for(int i=0;i<n;i++)
                            System.out.print(a[i]);
              }
}
                     