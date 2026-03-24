package Debug;
import java.util.*;
public class Infix {
    static int precedence(char ch){
        if (ch == '+' || ch == '-') return 1;
        if (ch == '*' || ch == '/') return 2;
        if (ch == '^') return 3;
        return -1;
    }

    public static void main(String[] args) {

        String s = "(A+B)*C";   // Input expression

        Stack<Character> st = new Stack<>();
        StringBuilder result = new StringBuilder();

        for(char c : s.toCharArray()){

            if(Character.isLetterOrDigit(c)){
                result.append(c);
            }

            else if(c == '('){
                st.push(c);
            }

            else if(c == ')'){
                while(!st.isEmpty() && st.peek() != '('){
                    result.append(st.pop());
                }
                st.pop(); // remove '('
            }

            else {
                while(!st.isEmpty() &&
                        precedence(st.peek()) >= precedence(c)){
                    result.append(st.pop());
                }
                st.push(c);
            }
        }

        while(!st.isEmpty()){
            result.append(st.pop());
        }

        System.out.println(result);
    }
}
