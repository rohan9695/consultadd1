package task5;

import java.util.Stack;


public class seven {
    public static void main(String[] args) {
        String s = "{{}}()";
        System.out.print(s);

    }

    static boolean valid(String str) {
        Stack<Character> stack = new Stack<Character>();
        /*for (char c : str.toCharArray()){
          if (c == "(" || c == "{" || c == "[") {
                stack.push(c);
            }else if(c == ")" && !stack.isEmpty()&& stack.peek()=="("){
                stack.pop();
            }else if(c == "}" && !stack.isEmpty()&& stack.peek()=="{") {
                stack.pop();
            }else if(c == "]" && !stack.isEmpty()&& stack.peek()=="["){
                stack.pop();
            }else{
                return false;
            }
            return stack.isEmpty();

    }*/
        return false;
    }
}
