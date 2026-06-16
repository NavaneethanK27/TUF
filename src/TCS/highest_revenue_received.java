package TCS;

public class highest_revenue_received {
    public static void main(String[] args){
        int[][] mat= {{100,198,333,323},{123,232,221,111}, {223,565,245,764}};
        int max  = 0;
        int n=mat.length;
        int m = mat[0].length;
        for(int i=0;i<n;i++){
            max=0;
            for(int j=0;j<m;j++){
                max = Math.max(max,mat[i][j]);
            }
            System.out.println(max);
        }
    }
}
