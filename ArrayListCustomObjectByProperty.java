import java.util.*;
public class main{
    String p;
    public main(String p){
        this.p=p;
    }
    public String getCustomObjectProperty(){
        return this.p;
    } 
    public static void main(String a[]){
        ArrayList<main> aa=new ArrayList<>();
        aa.add(new main("hh"));
        aa.add(new main("aa"));
        aa.add(new main("jj"));
        aa.add(new main("ll"));
        aa.sort((ob1,ob2)->ob1.getCustomObjectProperty().compareTo(ob2.getCustomObjectProperty()));
        for(main m1:aa){
            System.out.println(m1.getCustomObjectProperty());
        }
    }
}
