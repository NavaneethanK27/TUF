package Graph;

public class Nova_in_a_maze {
    public static String check(char[][] mat,int n,int m){
        StringBuilder path = new StringBuilder();
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(mat[i][j]=='1'){
                    path.append(dfs(mat, i, j, n, m));
                }
            }
        }
        return path.toString();
    }
    public static String dfs(char[][] mat, int i, int j,int n,int m){
        if(mat[n-1][m-1]!='1'|| i<0 || j<0 || i>=mat.length || j>=mat[0].length || mat[i][j]=='0') {
            return "";
        }
        dfs(mat,i-1,j,n,m);
        dfs(mat,i+1,j,n,m);
        dfs(mat,i,j-1,n,m);
        dfs(mat,i,j+1,n,m);
        if(mat[i][j+1]=='1'){
            return "R";
        }else{
            return "D";
        }


    }
    public static void main(String[] args){
        int n = 3,m=3;
        char[][] mat = {{'1','0','0','0'},{'1','1','0','1'},{'1','1','0','0'},{'0','1','1','1'}};
        System.out.println(check(mat,n,m));
    }
}
