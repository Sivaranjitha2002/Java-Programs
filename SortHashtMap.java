import java.util.*;
import java.util.Map.Entry;
public class main{
    public static void main(String a[]) throws Exception{
        LinkedHashMap<Integer,String> values=new LinkedHashMap();
        values.put(4,"Hariyana");
        values.put(1,"India");
        values.put(3,"Pakkisthan");
        values.put(2,"Srilanka");
         System.out.println("The Values are : ");
         System.out.println("Key => Value");
         for(Map.Entry en:values.entrySet()){
            System.out.print(en.getKey()+" => ");
            System.out.println(en.getValue());
        }
        Map<Integer,String> res=sortMap(values);
         System.out.println("The sorted Values are: ");
        System.out.println("Key => Value");
        for(Map.Entry en:res.entrySet()){
            System.out.print(en.getKey()+" => ");
            System.out.println(en.getValue());
        }
    }
    public static LinkedHashMap sortMap(LinkedHashMap map){
        List <Entry<Integer,String>> cablist=new LinkedList<>(map.entrySet());
        Collections.sort(cablist,(v1,v2)->v1.getKey().compareTo(v2.getKey()));
        LinkedHashMap<Integer,String> map1=new LinkedHashMap();
        for(Map.Entry<Integer,String> entry:cablist){
            map1.put(entry.getKey(),entry.getValue());
        }
        return map1;
    }
}
