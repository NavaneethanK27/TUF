package Tree;
import java.util.*;
class Node{
    int data;
    Node left;
    Node right;
    Node(int data){
        this.data=data;
        this.left=null;
        this.right=null;
    }
}
class Tree{
    Node root = null;
    void insert(int data){
        Node new_node=new Node(data);
        if(root==null){
            root=new_node;
            return;
        }
        Node[] Queue=new Node[100];
        int front=0,rear=0;
        Queue[rear++]=root;
        while(front<rear){
            Node temp = Queue[front++];
            if(temp.left==null){
              temp.left=new_node;
              return;
            }
            else {
                Queue[rear++] = temp.left;
            }
            if(temp.right==null){
                temp.right=new_node;
                return;
            }
            else{
                Queue[rear++]=temp.right;
            }
        }
    }
    void Inorder(Node root){
        Node temp= root;
        if(temp!=null){
            Inorder(temp.left);
            System.out.print(temp.data+" ");
            Inorder(temp.right);
        }
    }
    void preorder(Node root){
        Node temp=root;
        if(temp!=null){
            System.out.print(temp.data+" ");
            preorder(temp.left);
            preorder(temp.right);
        }
    }
    void postorder(Node root){
        Node temp = root;
        if(temp!=null) {
            postorder(temp.left);
            postorder(temp.right);
            System.out.println(temp.data);
        }
    }
}
public class Implementationtree {
    public static void  main(String[] args){
      Scanner sc=new Scanner(System.in);
      Tree t=new Tree();
      int n=sc.nextInt();
      for(int i=0;i<n;i++) {
          int data = sc.nextInt();
          t.insert(data);
      }
      t.Inorder(t.root);
      System.out.println();
      t.preorder(t.root);
      System.out.println();
      t.postorder(t.root);

    }

}
