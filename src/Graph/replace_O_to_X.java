package Graph;

import java.util.Scanner;

public class replace_O_to_X {
    public static void solve(char[][] grid,int n,int m){

        for(int i=0;i<n;i++){
            dfs(grid,i,0);
            dfs(grid,i,m-1);
        }

        for(int j=0;j<m;j++){
            dfs(grid,0,j);
            dfs(grid,n-1,j);
        }

        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(grid[i][j]=='O') {
                    grid[i][j] = 'X';
                }else if(grid[i][j]=='*'){
                    grid[i][j]='O';
                }
            }
        }
    }
    public static void dfs(char[][] grid,int i,int j){
        if(i<0 || j<0 || i>= grid.length || j>=grid[0].length || grid[i][j]!='O'){
              return;
        }
        grid[i][j]='*';
        dfs(grid,i+1,j);
        dfs(grid,i-1,j);
        dfs(grid,i,j+1);
        dfs(grid,i,j-1);
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        char[][] grid =  new char[n][m];
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                grid[i][j] = sc.next().charAt(0);
            }
        }
        solve(grid,n,m);

        // Output grid
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.print(grid[i][j] + " ");
            }
            System.out.println();
        }
        sc.close();


    }
}
