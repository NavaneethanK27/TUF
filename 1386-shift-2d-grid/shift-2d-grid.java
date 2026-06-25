class Solution {
    public static void first_changes(int[][] grid,int[][] res,int n,int m){
         for(int i=0;i<n;i++){
            for(int j=0;j<m-1;j++){
                res[i][j+1] = grid[i][j];
            }
         }
    }

    public static void second_changes(int[][] grid,int[][] res,int n,int m){
         for(int i=0;i<n-1;i++){
            for(int j=0;j<m;j++){
                res[i+1][0] = grid[i][m-1];
            }
         }
    }

    
    public static void Third_changes(int[][] grid,int[][] res,int n,int m){
         for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                res[0][0] = grid[n-1][m-1];
            }
         }
    }
    public List<List<Integer>> shiftGrid(int[][] grid, int k) {
        int n = grid.length;
        int m = grid[0].length;
    
        for(int i=0;i<k;i++){
            int[][] res = new int[n][m];
            first_changes(grid,res,n,m);
            second_changes(grid,res,n,m);
            Third_changes(grid,res,n,m);
            grid = res;
        }


        // for(int i=0;i<n;i++){
        //     for(int j=0;j<m;j++){
        //         System.out.print(grid[i][j]+" ");
        //     }
        //     System.out.println();
        // }

        return (List)Arrays.asList(grid);
    }
}