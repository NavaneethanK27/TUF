package Stack.Convex;

import javax.print.attribute.standard.PresentationDirection;
import java.util.Stack;

public class Infixtoprefix {
    public static  int precedence(char ch){
        if(ch=='^'){
            return 3;
        }
        else if(ch=='*' || ch=='/'){
            return 2;
        }else if(ch=='+' || ch=='-'){
            return 1;
        }
        return 0;
    }
    public static String Infixtopostfix(String Infix){
        StringBuilder sb = new StringBuilder();
        Stack<Character>st=new Stack<>();
        for(int i=0;i<Infix.length();i++){
            char ch = Infix.charAt(i);
            if(Character.isLetterOrDigit(ch)){
                sb.append(ch);
            }else if(ch=='('){
                st.push(ch);
            }else if(ch==')'){
                while(!st.isEmpty() && st.peek()!='('){
                    sb.append(st.pop());
                }
                st.pop();
            }else{
                while(!st.isEmpty() && precedence(st.peek())>precedence(ch)){
                    sb.append(st.pop());
                }
                st.push(ch);
            }
        }
        while(!st.isEmpty()){
            sb.append(st.pop());
        }
        return sb.reverse().toString();
    }
    public static String reverse(String Infix){
        StringBuilder sb = new StringBuilder(Infix);
        for(int i=0;i<Infix.length();i++){
            if(Infix.charAt(i)=='('){
                sb.setCharAt(i,')');
            }else if(Infix.charAt(i)==')'){
                sb.setCharAt(i,'(');
            }
        }

        return sb.reverse().toString();
    }
    public static void main(String[] args){
        String Infix ="x+y*z/w+u";
        String rev = reverse(Infix);
        System.out.println(Infixtopostfix(rev));

    }
}
