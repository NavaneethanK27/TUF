package Arrays.Hard;
import java.util.*;
public class pascal_Triangle {

    public static ArrayList<Integer> genreateallrow(int row){
        int ans = 1;
        ArrayList<Integer>list = new ArrayList<>();
        list.add(ans);
        for(int col=1;col<row;col++){
            ans = ans*(row-col);
            ans = ans/col;
            list.add(ans);
        }
        return list;
    }

    public static void print_the_pascal_triangle(int n){
        ArrayList<ArrayList<Integer>>list = new ArrayList<>();
        for(int row=1;row<=n;row++){
            list.add(genreateallrow(row));
        }
        System.out.println(list);
    }

    public static void printtherowofpascaltriangle(int n){
        int ans = 1;
        System.out.print(ans+" ");
        for(int i=1;i<n;i++){
            ans = ans*(n-i);
            ans = ans/i;
            System.out.print(ans+" ");
        }
    }

    public static void combination(int n,int r){
        //given r and c find the element found at place c,r;
        int res =1;
        for(int i=0;i<r;i++){
            res=res*(n-i);
            res=res/(i+1);
        }
        System.out.println(res);
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int r = sc.nextInt();
        int c= sc.nextInt();
       combination(r-1,c-1);
       printtherowofpascaltriangle(5);
       print_the_pascal_triangle(6);
    }
}
