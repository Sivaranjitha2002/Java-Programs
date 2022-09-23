import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
public class main{
    public static void main(String h[]){
        LocalDateTime l=LocalDateTime.now();
        DateTimeFormatter f=DateTimeFormatter.ofPattern("YYYY-MM-d");
        String c=l.format(f);
        System.out.println("Current Date is "+c);
    }
}
