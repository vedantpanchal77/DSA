
import java.util.HashSet;

// Hash Set

public class hashset {
    public static void main(String[] args) {

        int[] arr = {1, 2, 1, 3, 2, 1};
        HashSet<Integer> set= new HashSet<>();
        for (int num : arr){
            set.add(num);
        }
        System.out.println(set);
    }
}