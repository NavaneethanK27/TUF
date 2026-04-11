package Graph;

import java.util.*;
import java.util.Queue;

class Node3{
    int first;
    int second;
    public Node3(int first, int second){
        this.first = first;
        this.second = second;
    }
}
class number_of_islands_using_bfs {
    public static void main(String[] args) {
        char[][] grid = {
                {'1', '1', '0', '0', '0'},
                {'1', '1', '0', '0', '0'},
                {'0', '0', '1', '0', '0'},
                {'0', '0', '0', '1', '1'}
        };
        number_of_islands_using_bfs nm = new number_of_islands_using_bfs();
        int res=nm.numIslands(grid);
        System.out.println(res);
    }
    public int numIslands(char[][] grid) {
        int n = grid.length;
        int m = grid[0].length;
        int count=0;
        boolean[][] vis = new boolean[n][m];
        for(int i = 0 ; i< n ;i++){
            for(int j = 0;j < m;j++){
                if(grid[i][j]== '1' && vis[i][j] == false){
                    bfs(i, j, grid, vis);
                    count++;
                }
            }
        }
        return count;
    }
     public static void bfs(int i, int j, char[][] grid, boolean[][] vis){
        int n = grid.length;
        int m = grid[0].length;
        Queue<Node3> q= new LinkedList<>();
        q.offer(new Node3(i, j));
        int[] delrow = {1, 0, -1,0};
        int[] delcol = {0, 1, 0, -1};
        while(!q.isEmpty()){
            int row = q.peek().first;
            int col = q.peek().second;
            q.poll();
            for(int k = 0; k < 4;k++){
                int nrow = row + delrow[k];
                int ncol = col + delcol[k];
                if(nrow >= 0 && nrow < n && ncol >=0 && ncol < m && vis[nrow][ncol] == false && grid[nrow][ncol] == '1'){
                    vis[nrow][ncol] = true;
                    q.offer(new Node3(nrow, ncol));
                }
            }
        }
    }
}