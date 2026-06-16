// Count Characters
import java.util.*;

public class countcharactors {
    public static void main(String[] args) {

        String s ="banana";

        HashMap<Character, Integer> map = new HashMap<>();

        for(char st : s.toCharArray()) {
            map.put(st, map.getOrDefault(st, 0) + 1);
        }

        System.out.println(map);
    }
}