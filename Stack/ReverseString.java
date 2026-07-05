// Reverse a String


import java.util.Stack;

public class ReverseString {

    public static void main(String[] args) {

        Stack<Character> stack = new Stack<>();
        String a="hello";
        for(int i=0;i<a.length();i++){
            stack.push(a.charAt(i));
        }
        String rev="";
        while(!stack.isEmpty()){
            rev+=stack.pop();
        }
        System.out.println(rev);
     
    }
}