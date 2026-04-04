package Arrays.medium;
import java.util.*;
public class rotate_matrix_90 {
    public static void reverse(int[][] mat,int n,int m){
            for (int i = 0; i < n; i++) {
                int left = 0, right = n - 1;
                while (left < right) {
                    int temp = mat[i][left];
                    mat[i][left] = mat[i][right];
                    mat[i][right] = temp;
                    left++;
                    right--;
                }
            }
    }
    public  static void swap(int[][] mat,int i,int j){
        int temp = mat[i][j];
        mat[i][j]=mat[j][i];
        mat[j][i]=temp;
    }
    public static void transpose(int[][] mat,int n,int m){
        for(int i=0;i<n;i++){
            for(int j=i+1;j<m;j++){
                if(i!=j){
                    swap(mat,i,j);
                }
            }
        }
    }
    public static void main(String[] args){
        int[][] mat = {{1,2,3,4},{5,6,7,8},{9,10,11,12},{13,14,15,16}};
        int n=mat.length;
        int m =mat[0].length;
        transpose(mat,n,m);
        reverse(mat,n,m);
        System.out.println(Arrays.deepToString(mat));
    }
}
