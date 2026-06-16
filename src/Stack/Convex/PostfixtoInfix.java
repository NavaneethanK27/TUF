package Stack.Convex;

import java.util.Stack;

public class PostfixtoInfix {
    public static String Infix(String Postfix){
        Stack<String>st =new Stack<>();
        for(int i=0;i<Postfix.length();i++){
            char ch = Postfix.charAt(i);
            if(Character.isLetterOrDigit(ch)){
                st.push(Character.toString(ch));
            }else{
                String opt1 = st.pop();
                String opt2 = st.pop();
                String result = "("+opt2+ch+opt1+")";
                st.push(result);
            }
        }
        return st.peek();
    }
    public static void main(String[] args){
        System.out.println(Infix("ab*cd/+"));
    }
}
