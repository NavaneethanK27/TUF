package Graph;

//import java.util.LinkedList;
import java.util.*;
import java.util.Queue;

public class rotten_oranges {
    public static int Orange_rotten(int[][] grid,int row,int col){
        Queue<int[]> q = new LinkedList<>();
        int fresh = 0;
// Step 1: Initialize queue and count fresh oranges
        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                if(grid[i][j]==2){
                    q.offer(new int[]{i,j,0});
                }else if(grid[i][j]==1){
                    fresh++;
                }
            }
        }
        //step 2: BFS
        if(fresh == 0) return 0;

        int mintues = 0;
        int[][] direction = {{0,1},{0,-1},{1,0},{-1,0}};

        while (!q.isEmpty()){
            int[] curr = q.poll();
            int r = curr[0], c = curr[1], time = curr[2];
            for(int[] dir:direction) {
                int nr = r+dir[0];
                int nc = c+dir[1];
                if(nr>=0 && nc>=0 && nr<row && nc<col && grid[nr][nc]==1){
                    grid[nr][nc] = 2;
                    fresh--;
                    mintues = time+1;
                    q.offer(new int[]{nr,nc,time+1});
                }
            }
        }
        return fresh==0?mintues:-1;

    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int row = sc.nextInt();
        int col = sc.nextInt();
        int[][] grid = new int[row][col];

        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                grid[i][j]=sc.nextInt();
            }
        }
      System.out.println(Orange_rotten(grid,row,col));
    }
}
