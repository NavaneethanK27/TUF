package Stack;

import java.util.Stack;

public class Evaluatereversepolishnotation {
    public static void main(String[] args){
        String[] tokens ={"4","13","5","/","+"};
        Stack<Integer>st=new Stack<>();
        for(String i:tokens){
            if(i=="+"){
                int a=st.pop();
                int b=st.pop();
                st.push(a+b);
            }else if(i=="-"){
                int a=st.pop();
                int b=st.pop();
                st.push(b-a);
            }else if(i=="*"){
                int a = st.pop();
                int b = st.pop();
                st.push(a*b);
            }else if(i=="/"){
                int a = st.pop();
                int b = st.pop();
                st.push(b/a);
            }else{
                st.push(Integer.parseInt(i));
            }

        }
        System.out.println(st.pop());
    }
}
