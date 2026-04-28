package Stack;

import java.util.LinkedList;
import java.util.Queue;

class stack{
    Queue<Integer>q= new LinkedList<>();
    public void push(int data){
        q.add(data);
        for(int i=0;i<q.size()-1;i++){
            q.add(q.remove());
        }
    }
    public int pop(){
        return q.remove();
    }

    public int top(){
        return q.peek();
    }

    public int peek(){
        return q.peek();
    }

    public void display(){
        System.out.println(q);
    }

}
public class implement_stack_using_queue {
    public static void main(String[] args){
      int[] arr = {1,2,3,4,5};
      stack s = new stack();
      for(int i:arr){
          s.push(i);
      }
      System.out.println(s.pop());
      System.out.println(s.top());
      System.out.println(s.peek());
      s.display();

    }
}
