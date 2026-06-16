package Stack.Convex;
import java.util.*;
public class Infixtopostfix {
    public  static  int precedence(char ch){
        if(ch=='^'){
            return 3;
        }else if(ch=='*' || ch=='/'){
            return 2;
        }else if(ch=='+' || ch=='-'){
            return 1;
        }
        return 0;
    }
    public static String infixToPostfix(String infix){
        StringBuilder postfix  = new StringBuilder();

        Stack<Character>st = new Stack();
        for(int i=0;i<infix.length();i++){
            char ch=infix.charAt(i);
            if(Character.isAlphabetic(ch)){
                postfix.append(ch);
            }else if(ch=='('){
                st.push(ch);
            }else if(ch==')'){
                 while (st.peek()!='('){
                     postfix.append(st.pop());
                 }
                 st.pop();
            }else{
               while(!st.isEmpty() && precedence(st.peek())>=precedence(ch)){
                   postfix.append(st.pop());
               }
               st.push(ch);
            }
        }
        return postfix.toString();

    }
    public static void main(String[] args){
         Scanner sc = new Scanner (System.in);
         String str = sc.next();
         System.out.println(infixToPostfix(str));
    }
}
