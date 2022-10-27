import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.nio.charset.StandardCharsets;
class main{
             public static void main(String aa[]){
             String val="sivaranjitha";
             System.out.println("String :"+val);
             try{
                       InputStream s=new ByteArrayInputStream(val.getBytes(StandardCharsets.UTF_8));
                       System.out.println("Legth of string at initial :"+s.available());
                       s.read();
                       s.read();
                       s.read();
                       System.out.println("Legth of string after three reading :"+s.available());
             }
             catch(Exception e){
                         System.out.println(e);
             }
             }
}