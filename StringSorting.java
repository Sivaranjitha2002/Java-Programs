import java.util.*;
public class StringSorting{
    public static void main(String a[]) throws Exception{
        int i,j=0;
        char k;
        Scanner s=new Scanner(System.in);
        System.out.print("Enter the Number of words:");
        int n=s.nextInt();
        System.out.print("Enter the words:");
        String[] str=new String[20];
        for(i=0;i<n;i++)
              str[i]=s.nextLine();
        for(i=0;i<n;i++){
            for(j=i+1;j<n;j++){
                if(str[i].compareTo(str[j])>0){
                    String t=str[i];
                    str[i]=str[j];
                    str[j]=t;
                }
            }
        }
        System.out.print("Sorted Words: ");
        for(i=0;i<n;i++)
              System.out.print(str[i]+" ");
    }
}
