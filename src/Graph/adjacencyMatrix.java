package Graph;
import java.util.*;

public class adjacencyMatrix {
    void markmatrix(int[][] matrix,int source,int destination){
        matrix[source][destination]=1;
        matrix[destination][source]=1;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        adjacencyMatrix am = new adjacencyMatrix();
        int noofvertex= sc.nextInt();
        int noofedges = sc.nextInt();
        int[][] matrix = new int[noofvertex][noofvertex];
        for(int i=0;i<noofedges;i++){
                int source = sc.nextInt();
                int destination = sc.nextInt();
                am.markmatrix(matrix,source,destination);
        }
        for(int i=0;i<noofvertex;i++){
            for(int j=0;j<noofvertex;j++){
                System.out.print(matrix[i][j]+" ");
            }
            System.out.println();
        }
    }
}
