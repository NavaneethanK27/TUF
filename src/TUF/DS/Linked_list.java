//package TUF.DS;
//class node2{
//    int data; //data value
//    node2 next; //Pointer to next Value
//
//    //Constructor with data and next
//    node2(int data1,node2 next1) {
//        data=data1;
//        next=next1;
//    }
//
//    //constructore with only data
//    node2(int data1){
//        data=data1;
//        next=null;
//    }
//}
//class lld{
//       static node2 convertarrtoLL(int[] arr){
//           node2 head=new node2(arr[0]);
//           node2 temp=head;
//           for(int i=1;i<arr.length;i++){
//               temp.next=new node2(arr[i]);
//               temp=temp.next;
//           }
//           return head;
//       }
//       void display(node2 head){
//           node2 temp=head;
//           while(temp!=null){
//               System.out.print(temp.data+"->");
//               temp=temp.next;
//           }
//           System.out.print("null");
//       }
//}
//public class Linked_list {
//    public static void main(String[] args) {
//        int[] arr={2,5,8,7};
//        lld l1=new lld();
//        l1.con
//        l1.display();
//
//    }
//}
