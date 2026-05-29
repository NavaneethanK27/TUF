package Stack.problems;
import java.util.*;
public class Asteroid_Collision {
    public static void solution(int[] asteroids){
        Stack<Integer>st = new Stack<>();
        int n=asteroids.length;
        for (int i=0;i<n;i++){
           int curr = asteroids[i];
           boolean alive = true;
           while(alive && !st.isEmpty() && st.peek()>0 && curr<0){
               if(Math.abs(st.peek())<=Math.abs(curr)){
                   st.pop();
               }else if(Math.abs(st.peek())<=Math.abs(curr)){
                   st.pop();
                   alive=false;
               }else{
                   alive = false;
               }
           }
           if(alive){
               st.push(curr);
           }
        }
        System.out.println(st);
    }
    public static void main(String[] args){
        int[] asteroids = {5,10,-5};
        solution(asteroids);

    }
}
