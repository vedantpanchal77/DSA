// HashMap Basics
import java.util.HashMap;


public class HashMapBasics {
    public static void main(String[] args) {

       HashMap<Integer,String> map= new HashMap<>();
       map.put(1, "Vedant");
       map.put(2,"Nirav");
       System.out.println(map.get(2));
       System.out.println(map.size());
       System.out.println(map);
       System.out.println(map.keySet());
      

System.out.println(map.getOrDefault(1, "name"));   // "vedant"
System.out.println(map.getOrDefault(3, "name"));  // "name"
    }
}