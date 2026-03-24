package Graph;

import java.util.ArrayList;
import java.util.Scanner;

public class courseSchedule {
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
    }
}
