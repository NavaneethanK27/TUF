package Arrays.medium;

import java.util.ArrayList;
import java.util.Scanner;

public class spiral_matrix {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[][] mat = new int [n][m];
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                mat[i][j]=sc.nextInt();
            }
        }
        int left=0,right=m-1,bottom=n-1,top=0;

        ArrayList<Integer>list = new ArrayList<>();
        while (left<=right && top<=bottom) {
            for (int i = left; i <= right; i++) {
                list.add(mat[top][i]);
            }
            top++;

            for (int i = top; i <= bottom; i++) {
                list.add(mat[i][right]);
            }
            right--;
            if(top<=bottom){
            for (int i = right; i >= left; i--) {
                list.add(mat[bottom][i]);
            }
            bottom--;
            }
            if(left<=right) {
                for (int i = bottom; i >= top; i--) {
                    list.add(mat[i][left]);
                }
                left++;
            }
        }
        System.out.println(list);
    }
}
