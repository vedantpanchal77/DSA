
import java.util.*;


// Find Most Frequent Element
 public class mostFrequnt {
    public static void main(String[] args) {
        int[] arr = {1, 2, 1, 3, 2, 1};

        int max = 0;
        int ans=-1;
        

        HashMap<Integer, Integer> map = new HashMap<>();

        for (int num : arr) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }

        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
           if(entry.getValue()>max){
            max=entry.getValue();
            ans=entry.getKey();
           }
        }

        System.out.println("Most frequent element: " + ans);
    }
}