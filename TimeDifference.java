import java.util.*;
public class Time{
    int h,m,s;
    public Time(int h,int m,int s){
        this.h=h;
        this.m=m;
        this.s=s;
    }
    public static void main(String ii[]) throws Exception{
        Scanner s=new Scanner(System.in);
        System.out.print("Enter the Time1 Hour minutes Seconds: ");
        int h1=s.nextInt();
        int m1=s.nextInt();
        int s1=s.nextInt();
        System.out.print("Enter the Time2 Hour minutes Seconds: ");
        int h2=s.nextInt();
        int m2=s.nextInt();
        int s2=s.nextInt();
        Time t1=new Time(h1,m1,s1),t2=new Time(h2,m2,s2),t3;
        System.out.print("Time1 = "+t1.h+":"+t1.m+":"+t1.s+"\n");
        System.out.print("Time2 = "+t2.h+":"+t2.m+":"+t2.s+"\n");
        t3=differ(t1,t2);
        System.out.print("Difference = "+t3.h+":"+t3.m+":"+t3.s+"");
    }
    public static Time differ(Time t1,Time t2){
        Time t3=new Time(0,0,0);
        if(t1.s>t2.s){
            t2.m--;
            t2.s+=60;
        }
        t3.s=t2.s-t1.s;
        if(t1.m>t2.m){
            t2.h--;
            t2.m+=60;
        }
        t3.m=t2.m-t1.m;
        t3.h=t2.h-t1.h;
        return t3;
        
    }
}
