package Linked_List;

public class Remove_Nth_Node_From_End_of_List_19 {
      public class ListNode {
      int val;
      ListNode next;
      ListNode() {}
      ListNode(int val) { this.val = val; }
      ListNode(int val, ListNode next) { this.val = val; this.next = next; }
      }

    public ListNode removeNthFromEnd(ListNode head, int n) {

          ListNode dummy=new ListNode(0);
          dummy.next=head;
          ListNode fast=dummy;
          ListNode cur=dummy;

          for(int i=0;i<n;i++){
              fast=fast.next;
          }
          while(fast.next!=null){
              fast=fast.next;
              cur=cur.next;
          }

          cur.next=cur.next.next;


          return dummy.next;
    }
}
