package Binary_Tree;
import java.util.*;
class Node{
    int data;
    Node left;
    Node right;

    public Node(int data){

        this.data = data;
    }
}
class BinaryTree{
   Scanner sc = new Scanner(System.in);

   public Node createTree(){
       System.out.print("Enter data (-1 for no node): ");
       int data = sc.nextInt();

       if(data==-1){
           return null;
       }

       Node root = new Node(data);

       System.out.println("Enter left Child of "+data);
       root.left = createTree();

       System.out.println("Enter right child of "+data);
       root.right = createTree();

       return  root;
   }

   public void preorder(Node root){
       if(root==null){
           return;
       }

       System.out.print(root.data+" ");
       preorder(root.left);
       preorder(root.right);
   }

   public void Inorder(Node root){
       if(root==null){
           return;
       }
       Inorder(root.left);
       System.out.print(root.data+" ");
       Inorder(root.right);
   }

   public void postOrder(Node root){
       if(root==null){
           return;
       }
       postOrder(root.left);
       postOrder(root.right);
       System.out.print(root.data);
   }
}
public class Implementation {
    public static void main(String[] args){
         BinaryTree bt = new BinaryTree();

         Node root = bt.createTree();

         System.out.print("PreOrder Traversal: ");
         bt.preorder(root);

         System.out.print("PostOrder Traversal: ");
         bt.postOrder(root);

         System.out.print("Inorder Traversal: ");
         bt.Inorder(root);
    }
}

// same tree , symartic tree , path sum , validate BST , zig zag conversion