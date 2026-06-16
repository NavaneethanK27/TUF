package Graph;
class Graph{
    private int[][] matrix;
    private int vertices;

    public Graph(int vertices){
        this.vertices = vertices;
        matrix = new int[vertices] [vertices];
    }

    public void addEdge(int source,int destination){
        matrix[source][destination] =1;
        matrix[destination][source] = 1;
    }

    public void  removeEdge(int source,int destination){
        matrix[source][destination] = 0;
        matrix[destination][source] = 0;
    }

    public void printGraph(){
        for (int i = 0; i < vertices; i++) {
            for (int j = 0; j < vertices; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }
}
public class BFS {
    public static void main(String[] args){
        Graph g = new Graph(4);

        g.addEdge(0, 1);
        g.addEdge(0, 2);
        g.addEdge(1, 3);
        g.addEdge(2, 3);

        g.printGraph();
    }
}
