package Graph;

import java.util.ArrayList;

public class Numberofconnectedcomponents {
    public static int count(int[][] edges,int n){
        int count =0;
        ArrayList<ArrayList<Integer>>list=new ArrayList<>();
        for(int i=0;i<n;i++){
            list.add(new ArrayList<>());
        }

        for(int[] e:edges){
            int u=e[0];
            int v=e[1];
            list.get(u).add(v);
            list.get(v).add(u);
        }
        boolean[] visted = new boolean[n];
        for(int i=0;i<n;i++){
            if(!visted[i]){
                dfs(i,list,visted);
                count++;
            }
        }
        return count;
    }
    public static void dfs(int data,ArrayList<ArrayList<Integer>>list,boolean[] visited){
        visited[data]=true;
        for(int nieghbour:list.get(data)){
            if(!visited[nieghbour]){
                dfs(nieghbour,list,visited);
            }
        }
    }
    public static void main(String[] args){
        int n = 5;
        int[] [] edges ={{0,1},{1,2},{3,4}};
        System.out.println(count(edges,n));
    }
}
