package Linked_List;

public class Intersection_of_Two_Linked_Lists_LCCI_0207 {

    public class ListNode {
      int val;
      ListNode next;
      ListNode(int x) {
          val = x;
          next = null;
      }
  }

    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {

        ListNode curA=headA;
        ListNode curB=headB;

        int lenA=0,lenB=0;
        while(curA!=null){
            lenA++;
            curA=curA.next;
        }
        while(curB!=null){
            lenB++;
            curB=curB.next;
        }
        curA=headA;
        curB=headB;

        if(lenB>lenA){
            int templen=lenA;
            lenA=lenB;
            lenB=templen;

            ListNode tempNode=curA;
            curA=curB;
            curB=tempNode;
        }
        int gap=lenA-lenB;
        while(gap-->0){
            curA=curA.next;
        }
        while(curA!=null){
            if(curA==curB){
                return curA;
            }
            curA=curA.next;
            curB=curB.next;
        }
        return null;
    }
}
