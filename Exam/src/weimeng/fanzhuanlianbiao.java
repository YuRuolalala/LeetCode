package weimeng;

class ListNode {
      int val;
      ListNode next;
      ListNode() {}
      ListNode(int val) { this.val = val; }
      ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 }

public class fanzhuanlianbiao {
    public ListNode reverseList(ListNode head) {
        ListNode cur=head;
        ListNode pre=null;
        ListNode temp=null;
        while (cur!=null){
            temp=cur.next;
            cur.next=pre;
            pre=cur;
            cur=temp;
        }
        return pre;
    }
}
