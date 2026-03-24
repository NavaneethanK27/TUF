package queue;
import java.util.*;
class MainQueue{
    Stack<Integer>st1 = new Stack<>();
    Stack<Integer>st2 = new Stack<>();
    void enqueue(int data){
        while(!st1.isEmpty()){
            st2.push(st1.pop());
        }
        st1.push(data);
        while(!st2.isEmpty()){
            st1.push(st2.pop());
        }
    }void dequeue(){
        if(st1.isEmpty()){
            return;
        }
        System.out.println("Deleted Element :"+st1.pop());
    }
    int front(){
        if(st1.isEmpty()){
            return -1;
        }return st1.peek();
    }
    int size(){
        return st1.size();
    }
    void display(){
        System.out.println(st1);
    }
}
public class implementQueueusingtwostacks {

    public static void main(String[] args){
        int[] arr={1,2,3,4,5,6};
        MainQueue mq=new MainQueue();
        for (int j : arr) {
            mq.enqueue(j);
        }

        System.out.println(mq.front());
        mq.dequeue();
        System.out.println(mq.front());
        mq.display();
        System.out.println(mq.front());

    }
}
