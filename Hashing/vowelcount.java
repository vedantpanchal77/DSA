import java.util.*;

public class vowelcount {
    public static void main(String[] args) {

        String s ="banana";
        int count=0;

        HashMap<Character, Integer> map = new HashMap<>();

        for(char st : s.toCharArray()) {
            map.put(st, map.getOrDefault(st, 0) + 1);
        }

        for (Map.Entry<Character, Integer> en : map.entrySet()) {
            if (en.getKey() == 'a' || en.getKey() == 'e' || en.getKey() == 'i' ||
    en.getKey() == 'o' || en.getKey() == 'u') {
    count=count+en.getValue();
}
           
            
        }
        System.out.println(count);
    }
}