import java.util.*;
import java.math.RoundingMode;
import java.text.DecimalFormat;
public class Round{
    public static void main(String dd[]) throws Exception{
        Scanner s=new Scanner(System.in);
        System.out.print("Enter the value:");
        double n=s.nextDouble();
        DecimalFormat d=new DecimalFormat("#.##");
        d.setRoundingMode(RoundingMode.CEILING);
        System.out.println(d.format(n));
    }
}
