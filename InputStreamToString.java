import java.io.*;
public class InputFile{
    public static void main(String s[]) throws Exception{
        InputStream stream=new ByteArrayInputStream("hello their".getBytes());
        StringBuilder ss=new StringBuilder();
        String line;
        BufferedReader rr=new BufferedReader(new InputStreamReader(stream));
        while((line=rr.readLine())!=null){
            ss.append(line);
        }
        rr.close();
        System.out.println(ss);
        
    }
}
