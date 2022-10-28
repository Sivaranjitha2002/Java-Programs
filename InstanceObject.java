import java.io.*;
import java.util.*;
class class1{}
class class2{}
class main{
      public static void main(String aa[]){
             class1 c1=new class1();
             class2 c2=new class2();
            if(c1 instanceof class1){
                     System.out.println("c1 is object of class1");
            }
            else {
                     System.out.println("c1 is not a object of class1");
            }
             if(class2.class.isInstance(c2) ){
                     System.out.println("c2 is object of class2");
            }
            else {
                     System.out.println("c2 is not a object of class2");
            }
       }
}