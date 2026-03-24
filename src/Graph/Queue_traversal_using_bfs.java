package Graph;
import java.util.*;
class Queue{
    int[] queue;
    int front;
    int rear;
    int capacity ;
    Queue(int size){
        this.capacity = size;
        this.front=-1;
        this.rear=-1;
        queue = new int[capacity];
    }

    void enqueue(int data){
        if(rear==capacity-1){
            System.out.println("Queue is full");
            return;
        }
        if(front==-1 && rear == -1){
            front++;
            queue[++rear]=data;
        }else{
            queue[++rear]=data;
        }
    }
    int dequeue(){
        if (front>rear){
            System.out.println("Queue is Empty");
            return -1;
        }
        return queue[front++];
    }
    boolean isEmpty(){
        return front>rear || (front==-1 && rear ==-1);
    }
}
public class Queue_traversal_using_bfs {
    public void setmatrix(int[] [] matrix,int source,int desination){
        matrix[source][desination]=1;
        matrix[desination][source]=1;
    }
    public void bfs(int[][] matrix,int size,int start){
        Queue q = new Queue(size);
        int[] visited = new int[size];
        q.enqueue(start);
        visited[start]=1;
        while(!q.isEmpty()){
            int dequeueddata = q.dequeue();
            System.out.print(dequeueddata+" ");

            for(int i=0;i<size;i++){
                if(matrix[dequeueddata][i]==1 && visited[i] ==0){
                    visited[i]=1;
                    q.enqueue(i);
                }
            }
        }
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int noofvertices = sc.nextInt();
        System.out.println("Enter the noofvertices: ");
        int noofedges = sc.nextInt();
        int[] [] matrix = new int[noofvertices][noofvertices];
        Queue_traversal_using_bfs qtub = new Queue_traversal_using_bfs();
        for(int i=0;i<noofedges;i++){
            int source = sc.nextInt();
            int destination = sc.nextInt();
            qtub.setmatrix(matrix,source,destination);
        }
        System.out.println("BFS Traversal: ");
        qtub.bfs(matrix,noofvertices,2);
    }
}
