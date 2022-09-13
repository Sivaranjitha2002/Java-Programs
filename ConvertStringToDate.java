import java.time.*;
import java.time.format.*;
import java.util.*;
public class ConvertStringToDate{
     public static void main(String s[])throws Exception{
            System.out.println("Enter the Date(YYYY-MM-DD):");
            Scanner ss=new Scanner(System.in);
            String d=ss.nextLine();
            LocalDate date=LocalDate.parse(d,DateTimeFormatter.ISO_DATE);
            System.out.println("Date is: "+date);
     }
}
