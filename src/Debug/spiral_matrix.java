package Debug;

import java.util.ArrayList;
import java.util.Scanner;

public class spiral_matrix {
    public static void main(String[] args){
//        matrix = [[1,2,3],[4,5,6],[7,8,9]]
        int[][] matrix = new int[3][4];
        Scanner sc= new Scanner(System.in);
        for(int i=0;i<3;i++){
            for(int j=0;j<4;j++){
                matrix[i][j]=sc.nextInt();
            }
        }
        int left=0;
        int right=3;
        int top=0;
        int bottom=4;
        ArrayList<Integer>list= new ArrayList<>();
//        while (left<=right && top<=bottom){
            for(int i=left;i<=right;i++){
                list.add(matrix[left][i]);
            }
            left++;

            for(int i=left;i<=right;i++){
                list.add(matrix[i][bottom]);
            }bottom--;



//        }
        System.out.println(list);
    }
}
