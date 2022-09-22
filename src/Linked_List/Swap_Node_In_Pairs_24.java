package Linked_List;

import org.junit.Test;

import java.util.List;

public class Swap_Node_In_Pairs_24 {
    public class ListNode {
        int val;
        ListNode next;
        ListNode() {}
        ListNode(int val) { this.val = val; }
        ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    }

    public ListNode swapPairs(ListNode head) {

        ListNode dummy = new ListNode(0);
        dummy.next=head;
        ListNode cur=dummy;

        while(cur.next!=null&&cur.next.next!=null){
            ListNode temp=cur.next;
            ListNode temp1=cur.next.next.next;

            cur.next=cur.next.next;
            cur.next.next=temp;
            temp.next=temp1;
            cur=cur.next.next;

        }


        return dummy.next;
    }

    @Test
    public void test(){
        ListNode d=new ListNode(4,null);
        ListNode c=new ListNode(3,d);
        ListNode b=new ListNode(2,c);
        ListNode a=new ListNode(1,b);
        swapPairs(a);

    }

}
