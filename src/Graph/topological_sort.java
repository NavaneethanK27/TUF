package Graph;
import java.util.*;
import java.util.Stack;

public class topological_sort {
    public static void dfs(int node, boolean[] visted, Stack<Integer> stack, ArrayList<ArrayList<Integer>> graph) {
        visted[node] = true;
        for(int neighbour:graph.get(node)){
            if(!visted[neighbour]){
                dfs(neighbour,visted,stack,graph);
            }
        }
        stack.push(node);
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Number of vertics: ");
        int V = sc.nextInt();

        System.out.println("Enter the Number of Edges: ");
        int E = sc.nextInt();

        ArrayList<ArrayList<Integer>>graph= new ArrayList<>();

        for(int i=0;i<V;i++){
            graph.add(new ArrayList<>());
        }

        System.out.println("Enter edges (u v):");

        for(int i=0;i<E;i++){
            int u = sc.nextInt();
            int v = sc.nextInt();
            graph.get(u).add(v);
        }

        for(int i=0;i<V;i++){
            System.out.print(i+" -> ");
            for(int node:graph.get(i)){
                System.out.print(node+" ");
            }
            System.out.println();
        }

        //TOPOLOGICAL SORT

        boolean[] visited = new boolean[V];
        Stack<Integer>stack = new Stack<>();
        for(int i=0;i<V;i++){
            if(!visited[i]){
                dfs(i,visited,stack,graph);
            }
        }

        System.out.println("Topological sort: ");

        while(!stack.isEmpty()){
           System.out.println(stack.pop()+" ");
        }


    }
}
