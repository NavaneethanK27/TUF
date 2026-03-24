package queue;
import java.util.*;
class Arrayqueue{
    int[] queue;
    int start, end;
    int currsize, maxsize;

    Arrayqueue(int maxsize){
        this.maxsize = maxsize;
        queue = new int[maxsize];
        currsize = 0;
        start=-1;
        end=-1;
    }
    boolean isFull(){
        return currsize == maxsize;
    }

    boolean isEmpty(){
        return currsize == 0;
    }

    void enqueuerear(int data){
        if(isFull()){
            System.out.println("Queue is Full");
            return;
        }
        if(isEmpty()) {
            start = 0;
            end = 0;
        }else{
            end = (end+1)%maxsize;
        }
        queue[end] = data;
        currsize++;
    }

    void enqueuefront(int data){
        if(isFull()){
            System.out.println("Queue is Full");
            return;
        }
        if(isEmpty()){
            start=end=0;
        }else {
            start = (start - 1 + maxsize) % maxsize;
        }
            queue[start]= data;
            currsize++;
    }
    void dequeuefront(){
        if(isEmpty()){
            System.out.println("Queue is Empty");
            return;
        }
        int deleted = queue[start];

        if(currsize==1){
            start = end = -1;
        }else{
            start = (start+1)%maxsize;
        }
        currsize--;
        System.out.println("The deleted element: "+deleted);
    }
    void dequeuerear(){
        if(isEmpty()){
            System.out.println("Queue is Empty");
            return;
        }
        int deleted = queue[end];
        if(currsize==1){
            start = end = -1;
        }else{
            end = (end-1+maxsize)%maxsize;
        }
        currsize--;
        System.out.println("The deleted element: "+deleted);
    }
    void display(){
        if(isEmpty()){
            System.out.println("Queue is Empty");
            return;
        }
        System.out.println("The Queue elements are: ");
        int i = start;
        for(int count = 0 ;count<currsize;count
                ++){
            System.out.print(queue[i]);
            if(count!=currsize-1){
                System.out.print(" ");
            }
            i = (i+1)%maxsize;
        }System.out.println();
    }
}
public class implementusingqueue {
    public static void main(String[] args){
          Scanner sc = new Scanner(System.in);
          int maxsize = sc.nextInt();
          Arrayqueue ar  = new Arrayqueue(maxsize);
        while (true) {
            int operation = sc.nextInt();

            if (operation == 1) {
                int value = sc.nextInt();
                ar.enqueuerear(value);
            }
            else if (operation == 2) {
                int value = sc.nextInt();
                ar.enqueuefront(value);
            }
            else if (operation == 3) {
                ar.dequeuefront();
            }
            else if (operation == 4) {
                ar.dequeuerear();
            }
            else if (operation == 5) {
                ar.display();
            }
            else if (operation == 6) {
                System.out.println("Exiting...");
                break;
            }
        }
    }
}
