package Stack.UsngLinkedList;
class ListNode{
    int data;
    ListNode next;

    ListNode(int data){
        this.data=data;
        this.next=null;
    }
}
class stack{
    ListNode head;
    private int size;

    public void push(int data){
       ListNode new_node=new ListNode(data);
       new_node.next=head;
       head=new_node;
       size++;
    }

    public int pop(){
        if(head==null){
            System.out.println("Stack is empty");
            return -1;
        }
        int val=head.data;
        head=head.next;
        size--;
        return val;
    }

    public int peek(){
       return head.data;
    }

    public int getSize(){
        return size;
    }

    public boolean isEmpty(){
        return size==0;
    }

    public void display(){
        ListNode temp=head;
        while(temp!=null){
            System.out.print(temp.data+"->");
            temp=temp.next;
        }System.out.println("null");
    }
}
public class implement_stack_in_ll {
    public static void main(String[] args){
        int[] arr = {1,2,3,4,5};
        stack s = new stack();
        for(int i:arr){
            s.push(i);
        }
        System.out.println(s.peek());
        System.out.println(s.pop());
        s.display();
    }
}
