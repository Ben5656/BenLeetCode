package src;

import java.util.Stack;

public class ValidParentheses {


    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<Character>();

        for(int i = 0; i < s.length(); i++){
            if(s.charAt(i) == '('){
                stack.push(')');
            } else if(s.charAt(i) == '{'){
                stack.push('}');
            } else if(s.charAt(i) == '['){
                stack.push(']');
            } else {
                if(stack.empty() || stack.pop() != s.charAt(i)) return false;
            }
        }
        if(stack.empty()) return true;
        return false;
    }

}
