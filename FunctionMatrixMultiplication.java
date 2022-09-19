import java.util.*;
import java.io.*;
public class multiply{
    public static void main(String o[]) throws Exception{
         int[][] a=new int[50][20];
         int[][] b=new int[50][20];
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
         int[][] h=multiply(a,b,r1,r2,c2);
         display(h);
    }
    public static int[][] multiply(int[][] a,int[][] b,int r1,int r2,int c2){
        int[][] h=new int[r1][c2];
        int i,j,k;
        for(i=0;i<r1;i++){
             for(j=0;j<c2;j++){
                 for(k=0;k<r2;k++)
                    h[i][j]+=a[i][k]*b[k][j];
             }
              
         }
         return h;
    }
    public static void display(int[][] h){
        System.out.print("Multiplication: ");
        for(int[] i:h){
             for(int j:i){
                 System.out.print(j+" ");
             }
             System.out.print("\n");
         }  
    }
}
