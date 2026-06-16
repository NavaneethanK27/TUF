package Stack;
import java.util.*;
public class valid_parenthesis {
    public static int validparenthesis(String s){
        Stack<Integer>st = new Stack<>();
        int max=0;
        st.push(-1);
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            if(ch=='('){
                st.push(i);
            }else{
                st.pop();
                if(st.isEmpty()){
                    st.push(i);
                }else{
                    max=Math.max(max,i-st.peek());
                }
            }
        }
        return max;
    }
    public static void main(String[] args){
        String str = "()()";
        System.out.println(validparenthesis(str));
    }
}
