import java.util.*;
public class HashMap{
          public static void main(String aa[]){
                  Map<Integer, String> m = new LinkedHashMap<>();
                   m.put(1,"xxxx");
                   m.put(2,"xlln");
                   m.put(3,"kkkk");
                   List<Integer> l1=new ArrayList(m.keySet());
                   List<String> l2=new ArrayList(m.values());
                   System.out.println("Keys   :"+l1);
                   System.out.println("Values   :"+l2);
          }
}
