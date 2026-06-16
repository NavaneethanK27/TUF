package Stack.Convex;
import java.util.*;
public class Prefix_to_postfix {
    public static String postfix(String Prefix){
        String postfix = "";
        Stack<String>st = new Stack<>();
        for(int i=Prefix.length()-1;i>=0;i--){
            char ch = Prefix.charAt(i);
            if(Character.isLetterOrDigit(ch)){
                st.push(Character.toString(ch));
            }else{
                if(!st.isEmpty()) {
                    String opt1 = st.pop();
                    String opt2 = st.pop();
                    String result = opt1 + opt2 + ch;
                    st.push(result);
                }
            }
        }
        return st.peek();
    }
    public static void main(String[] args){
        String prefix  = "*-A/BC-/AKL";
        System.out.println(postfix(prefix));

    }
}
