import java.util.Calendar;
public class cal{
    public static void main(String a[]){
        Calendar c1=Calendar.getInstance();
        Calendar c2=Calendar.getInstance();
        Calendar cT=(Calendar)c1.clone();
        cT.add(Calendar.YEAR,c2.get(Calendar.YEAR));
         cT.add(Calendar.MONTH,c2.get(Calendar.MONTH));
         cT.add(Calendar.DATE,c2.get(Calendar.DATE));
         cT.add(Calendar.HOUR_OF_DAY,c2.get(Calendar.HOUR_OF_DAY));
         cT.add(Calendar.MINUTE,c2.get(Calendar.MINUTE));
         cT.add(Calendar.SECOND,c2.get(Calendar.SECOND));
         cT.add(Calendar.MILLISECOND,c2.get(Calendar.MILLISECOND));
         System.out.format("Date 1: %s\nDate 2: %s \nResult: %s", c1.getTime(), c2.getTime(), cT.getTime());
    }
}
