//package Queue;
//import java.util.*;
//public class reverse_Queue_within_K_elements {
//    public static void main(String[] args){
//        Scanner sc = new Scanner(System.in);
//        Queue<Integer>q=new LinkedList<>();
//        int n=sc.nextInt();
//        for(int i=0;i<n;i++){
//            int data=sc.nextInt();
//            q.add(data);
//        }
//        int k = sc.nextInt();
//        Stack<Integer>st = new Stack<>();
//        for(int i=0;i<k;i++){
//            st.push(q.remove());
//        }
//        for(int i=0;i<k;i++){
//            q.add(st.pop());
//        }
//        for(int i=0;i<n-k;i++){
//            q.add(q.remove());
//        }
//    System.out.println(q);
//    }
//}
