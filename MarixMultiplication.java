import java.util.*;
import java.io.*;
public class multiply{
    public static void main(String o[]) throws Exception{
         int a[][]=new int[50][20];
         int b[][]=new int[50][20];
         int h[][]=new int[50][20];
         int i,j,k;
         Scanner s=new Scanner(System.in);
         System.out.println("Enter the Row1:");
         int r1=s.nextInt();
          System.out.println("Enter the Column1:");
         int c1=s.nextInt();
         System.out.println("Enter the values:");
         for(i=0;i<r1;i++){
              for(j=0;j<c1;j++){
                 a[i][j]=s.nextInt();
             }
         }
         System.out.println("Enter the Row2:");
         int r2=s.nextInt();
         System.out.println("Enter the column2:");
         int c2=s.nextInt();
         System.out.println("Enter the values:");
         for(i=0;i<r2;i++){
             for(j=0;j<c2;j++){
                 b[i][j]=s.nextInt();
             }
              
         }
         for(i=0;i<r1;i++){
             for(j=0;j<c2;j++){
                 for(k=0;k<r2;k++)
                    h[i][j]+=a[i][k]*b[k][j];
             }
              
         }
         for(i=0;i<r2;i++){
             for(j=0;j<c2;j++){
                 System.out.print(h[i][j]+" ");
             }
             System.out.print("\n");
              
         }  
    }
}
