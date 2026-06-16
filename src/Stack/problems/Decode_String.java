package Stack.problems;

import java.util.*;
public class Decode_String {
    public static void main(String[] args){
        String str ="2[abc]3[cd]ef";

        Stack<String> st = new Stack<>();
        for(int i=0;i<str.length();i++){
            char ch = str.charAt(i);

            if(ch!=']'){
                st.push(Character.toString(ch));
            }else{
                StringBuilder rev = new StringBuilder();
                while(!st.isEmpty() && !(st.peek().equals("["))){
                     rev.insert(0,st.pop());
                }
                st.pop();
//                rev.reverse();
                StringBuilder digit = new StringBuilder();
                while(!st.isEmpty() && Character.isDigit(st.peek().charAt(0))){
                    digit.insert(0,st.pop());
                }
                int n=Integer.parseInt(digit.toString());

                String temp = rev.toString();
                StringBuilder repeated = new StringBuilder();
                for(int j=0;j<n;j++) {
                    repeated.append(temp);
                }
                st.push(repeated.toString());
            }

        }
       StringBuilder res = new StringBuilder();
        for(String i:st){
            res.append(i);
        }
        System.out.println(res);

    }
}