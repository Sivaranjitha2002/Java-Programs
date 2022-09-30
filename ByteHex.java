import java.util.*;
public class ByteHex{
             public static void main(String aaa[]){
                        byte[] b={10,2,15,11};
                        for(byte bbb:b){
                                     String s=String.format("%02X",bbb);
                                     System.out.print(s); 
                         }
             }
}
