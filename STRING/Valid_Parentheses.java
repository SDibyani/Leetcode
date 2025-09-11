import java.util.Stack;

public class Valid_Parentheses {
    public boolean isValid(String str) {
        Stack<Character> s = new Stack<>();

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);

            if (ch == '(' || ch == '{' || ch == '[') {
                s.push(ch);
            } else {
                if (s.isEmpty()) {
                    return false;
                }
                if ((s.peek() == '(' && ch == ')') ||
                    (s.peek() == '{' && ch == '}') ||
                    (s.peek() == '[' && ch == ']')) {
                    s.pop();
                } else {
                    return false;
                }
            }
        }
        return s.isEmpty();
    }
    public static void main(String[] args) {
        Valid_Parentheses sol = new Valid_Parentheses();

        String test1 = "(){}[]";
        String test2 = "([{}])";
        String test3 = "({[)]}";
        String test4 = "(((";

        System.out.println(test1 + " -> " + sol.isValid(test1)); 
        System.out.println(test2 + " -> " + sol.isValid(test2)); 
        System.out.println(test3 + " -> " + sol.isValid(test3)); 
        System.out.println(test4 + " -> " + sol.isValid(test4)); 
    }
    
}
