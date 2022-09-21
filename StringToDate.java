import java.util.*;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
public class StringToDate{
    public static void main(String t[]) throws Exception{
        Scanner s=new Scanner(System.in);
        System.out.print("Enter the Date(yyyy-mm-dd): ");
        String n=s.nextLine();
        LocalDate l=LocalDate.parse(n,DateTimeFormatter.ISO_DATE);
        System.out.println(l);
        DateTimeFormatter f=DateTimeFormatter.ofPattern("yyyy-MM-dd",Locale.ENGLISH);
        l=LocalDate.parse(n,f);
        System.out.println(l);
    }
}
