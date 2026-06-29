import java.util.*;
public class lengthOfLongestSubstring{
    public static void main(String[] args) {
        HashSet<Character> set = new HashSet<>();
        String s="abcde";
        int left = 0;
        int max = 0;
        for(int right=0;right<s.length();right++){
            char c= s.charAt(right);
            while(set.contains(c)){
                set.remove(s.charAt(left));
                left++;
            }
            set.add(c);
            if((right-left+1)>max){
                max=right-left+1;
            }
        }
        System.out.println(max);
    }
}