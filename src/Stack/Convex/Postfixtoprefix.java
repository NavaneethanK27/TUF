package Stack.Convex;

import java.util.Stack;

public class Postfixtoprefix {
    public static String prefix(String postfix){
        Stack<String>st  = new Stack<>();
        for(int i=0;i<postfix.length();i++){
            char ch=postfix.charAt(i);
            if(Character.isLetterOrDigit(ch)){
                st.push(Character.toString(ch));
            }else{
                String opt1=st.pop();
                String opt2 = st.pop();
                String result = ch+opt2+opt1;
                st.push(result);
            }
        }
        return st.peek();
    }
    public static void main(String[] args){
        String postfix = "AB-DE+F*/";
       System.out.println(prefix(postfix));

    }
}
