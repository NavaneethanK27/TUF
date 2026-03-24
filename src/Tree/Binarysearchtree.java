package Tree;
import java.util.*;
class node{
    int data;
    node left,right;
    node(int data){
        this.data=data;
        this.left=this.right=null;
    }
}
class BST {

    node root = null;

    public void insert(int data) {
        node new_node = new node(data);
        if (root == null) {
            root = new_node;
            return;
        }
        node temp = root;
        node curr = null;
        while (temp != null) {
            curr = temp;
            if (data < temp.data) {
                temp = temp.left;
            } else {
                temp = temp.right;
            }
        }
        if (data < curr.data) {
            curr.left = new_node;
        } else {
            curr.right = new_node;
        }
    }

    void inorder(node temp) {
        if (temp != null) {
            inorder(temp.left);
            System.out.println(temp.data);
            inorder(temp.right);
        }
    }

    void preorder(node temp) {
        if (temp != null) {
            System.out.println(temp.data);
            preorder(temp.left);
            preorder(temp.right);
        }
    }

    void postorder(node temp) {
        if (temp != null) {
            preorder(temp.left);
            preorder(temp.right);
            System.out.println(temp.data);
        }
    }

    boolean search(node root, int n) {
        node temp = root;
        node curr = null;
        while (temp != null) {
            if (temp.data == n) {
                return true;
            }
            if (n < temp.data) {
                temp = temp.left;
            } else {
                temp = temp.right;
            }
        }
        return false;
    }
}
public class

Binarysearchtree {

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        BST b =new BST();
        int size = sc.nextInt();
        for(int i=0;i<size;i++){
            int data = sc.nextInt();
            b.insert(data);
        }
        b.inorder(b.root);
        System.out.println();
        b.preorder(b.root);
        System.out.println();
        b.postorder(b.root);
        boolean check = b.search(b.root, 10);
        System.out.println(check);
    }
}
