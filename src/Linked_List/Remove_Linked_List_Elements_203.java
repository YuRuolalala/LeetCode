package Linked_List;

public class Remove_Linked_List_Elements_203 {

      public class ListNode {
      int val;
      ListNode next;
      ListNode() {}
      ListNode(int val) { this.val = val; }
      ListNode(int val, ListNode next) { this.val = val; this.next = next; }
  }


    /**
     * 不用虚拟头节点
     * @param head
     * @param val
     * @return
     */
    public ListNode removeElements(ListNode head, int val) {

          while(head!=null&&head.val==val){
              head=head.next;
          }
          ListNode listNode=head;
          while(listNode!=null){
            while(listNode.next!=null&&listNode.next.val==val){
                listNode.next=listNode.next.next;
            }
            head=head.next;
          }
          return head;
    }

    /**
     * 用虚拟头节点
     */
    public ListNode removeElementss(ListNode head,int val){
        if(head==null){
            return head;
        }
        ListNode dummy = new ListNode(-1,head);
        ListNode pre=dummy;
        ListNode cur=head;
        while(cur!=null){
            if(cur.val==val){
                pre.next=cur.next;
            }
            else{
                pre=cur;
            }
            cur=cur.next;
        }
        return dummy.next;
    }

}
