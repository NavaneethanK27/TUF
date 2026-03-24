package Graph;
import java.util.*;
class Stack{
    int[] stack;
    int size;
    int top;
    Stack(int size){
        this.size=size;
        stack = new int[size];
        this.top=-1;
    }
    void push(int data){
        if(top==size-1){
            System.out.println("Stack is Full");
            return;
        }
        stack[++top]=data;
    }
    int pop(){
        if(top==-1){
            System.out.println("Stack is Empty");
        }
        return stack[top--];
    }
    int peek(){
        if(top==-1){
            System.out.println("Stack is Empty");
        }
        return stack[top];
    }
    boolean isEmpty(){
        return top==-1;
    }
}
public class graph_traversal_dfs {
    void markmatrix(int[][] matrix,int source,int destination){
        matrix[source][destination]=1;
        matrix[destination][source]=1;
    }
    void d_f_s(int[][] matrix,int size,int start){
        Stack st = new Stack(size);
        st.push(start);
        int[] visted = new int[size];
        while (!st.isEmpty()){
            int data = st.pop();
            if(visted[data]==0){
                visted[data]=1;
                System.out.print(data+" ");
            }
            for(int i=size-1;i>=0;i--){
                if(matrix[data][i]==1 && visted[i]==0){
                    st.push(i);
                }
            }
        }

    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the noofvertices: ");
        int noofvertices = sc.nextInt();
        System.out.println("Enter the noofedges: ");
        int noofedges = sc.nextInt();
        System.out.println();
        int[] [] matrix = new int[noofvertices][noofvertices];
        graph_traversal_dfs dfs = new graph_traversal_dfs();
        for(int i=0;i<noofedges;i++){
            int source = sc.nextInt();
            int destination = sc.nextInt();
            dfs.markmatrix(matrix,source,destination);
        }
        dfs.d_f_s(matrix,noofvertices,0);
    }
}
