//package Arrays.medium;
//import java.util.*;
//class brute{
//    static void marki(int[][] a,int m,int i){
//        for(int j=0;j<m;j++){
//            if(a[i][j]!=0){
//                a[i][j]=-1;
//            }
//        }
//    }
//    static void markj(int[][] b,int n,int j){
//        for(int i=0;i<n;i++){
//            if(b[i][j]!=0){
//                b[i][j]=-1;
//            }
//        }
//    }
//    static void mark0(int[][] c,int n,int m){
//        for(int i=0;i<n;i++){
//            for(int j=0;j<m;j++){
//                if(c[i][j]==-1){
//                    c[i][j]=0;
//                }
//            }
//        }
//    }
//}
//class optimal{
//    int [][] arr={{1,1,1},{1,0,1},{1,1,1}};
//    int n=arr.length;
//    int m=arr[0].length;
//    int[] col=new int[m];
//    int[] row=new int[n];
//    for(int k=0;k<n;k++){
//        for(int j=0;j<m;j++){
//              if(arr[i][j]==0){
//                  row[i]=1;
//                  col[i]=1;
//              }
//        }
//    }
//    for(int i=0;i<n;i++){
//        for(int j=0;j<m;j++){
//            if(row[i] || col[j]){
//                arr[i][j]=0;
//            }
//        }
//    }
// }
//public class Setzeros {
//    public static void main(String[] args) {
//        Scanner sc=new Scanner(System.in);
//        int[] [] arr={{1,1,1},{1,0,1},{1,1,1}};
//        int n=arr.length;
//        int m=arr[0].length;
//        brute b=new brute();
//        for(int i=0;i<n;i++){
//            for(int j=0;j<m;j++){
//                if(arr[i][j]==0){
//                    brute.marki(arr,m,i);
//                    brute.markj(arr,n,j);
//                }
//            }
//        }
//        brute.mark0(arr,n,m);
//        System.out.print(Arrays.deepToString(arr));
//    }
//}
