package Arrays.medium;
import java.util.*;
public class roatetwodarray {
    static void optimal(int[][] matrix){
        int n=matrix.length;
        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                int temp=matrix[i][j];
                matrix[i][j]=matrix[j][i];
                matrix[j][i]=temp;
            }
        }
        for(int i=0;i<n;i++){
            int left=0,right=n-1;
            while(left<right){
                int temp=matrix[i][left];
                matrix[i][left]=matrix[i][right];
                matrix[i][right]=temp;
                left++;
                right--;
            }
        }
        System.out.print(Arrays.deepToString(matrix));
    }
    static void bruteforece(){
        int[] [] arr={{1,2,3,4},{5,6,7,8},{9,10,11,12},{13,14,15,16}};
        System.out.println(Arrays.deepToString(arr));
        int[] [] res=new int[4] [4];
        for(int i=0;i<4;i++){
            for(int j=0;j<4;j++){
                res[j] [(4-1)-i]=arr[i] [j];
            }
        }
        System.out.println(Arrays.deepToString(res));
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int row=sc.nextInt();
        int col=sc.nextInt();
        int[][] matrix=new int[row][col];
        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
               matrix[i][j]=sc.nextInt();
            }
        }
        optimal(matrix);
    }
}
