import java.util.*;
import java.io.*;
public class multiply{
    public static void main(String o[]) throws Exception{
         int[][] a=new int[50][20];
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
         int[][] h=transpose(a,r1,c1);
         display(h);
    }
    public static int[][] transpose(int[][] a,int r1,int c1){
        int[][] h=new int[c1][r1];
        int i,j,k;
        System.out.println(c1);
        for(i=0;i<r1;i++){
             for(j=0;j<c1;j++){
                    h[j][i]=a[i][j];
             }
              
         }
         return h;
    }
    public static void display(int[][] h){
        System.out.print("Transpose: ");
        for(int[] i:h){
             for(int j:i){
                 System.out.print(j+" ");
             }
             System.out.print("\n");
         }  
    }
}
