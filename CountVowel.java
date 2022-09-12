import java.io.*;
import java.util.*;

public class Question4{  
    public static void main(String[] args) { 
	  int c=0;
         try{
            InputStreamReader r=new InputStreamReader(System.in);  
            BufferedReader br=new BufferedReader(r);  
            String s1 = br.readLine();
           //Write your code here to count the number of vowels in the string "s1"
int i=0;
char l;
int n=s1.length();
while(i<n){
    l=s1.charAt(i);
           if(l=='a' || l=='e' || l=='i' || l=='o' || l=='u')
              c++;
           else if(l=='A' || l=='E' || l=='I' || l=='O' || l=='U')
               c++;
           
        i++;
    }
System.out.println(c); 
	   }
       catch (Exception e){
		 System.out.println(e);
	    }	   
    }  
} 
