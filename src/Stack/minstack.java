package Stack;

import java.util.Stack;

class MinStack1{
    Stack<Integer>st;
    Stack<Integer>ms;


    public MinStack1(){
        st = new Stack<>();
        ms = new Stack<>();
    }

    public void push(int val){
        st.push(val);
        if(ms.isEmpty() || val<st.peek()){
            ms.push(val);
        }
    }

    public void pop(){
       if(st.pop().equals(ms.peek())){
           ms.pop();
       }
       st.pop();
    }

    public int top(){
        return st.peek();
    }

    public int getmin(){
        return st.peek();
    }



}
public class minstack {
    public static void main(String[] args){
        MinStack1 st = new MinStack1();
        st.push(4);
        st.push(5);
        st.push(2);
        st.pop();
       System.out.println( st.getmin());
    }
}
