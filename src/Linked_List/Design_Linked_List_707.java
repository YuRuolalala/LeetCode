package Linked_List;

import org.junit.Test;

public class Design_Linked_List_707 {
    public static class ListNode {
        int val;
        ListNode next;
        ListNode() {}
        ListNode(int val) { this.val = val; }
        ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    }

    static class MyLinkedList{
        int size=0;
        ListNode head=new ListNode(0);
        ListNode cur=head;
        public int get(int index){
            cur=head;
            if(index<0||index>=size){
                return -1;
            }
            for(int i=0;i<index;i++){
                cur=cur.next;
            }
            return cur.next.val;
        }

        public void addAtHead(int val){
            cur=head;
            addAtIndex(0,val);

        }

        public void addAtTail(int val){
            cur=head;
            addAtIndex(size,val);
        }

        public void addAtIndex(int index,int val){
            cur=head;
            if(index>size){
                return ;
            }
            if(index<0){
                index=0;
            }
            size++;
            for(int i=0;i<index;i++){
                cur=cur.next;
            }
            ListNode newnode=new ListNode(val,cur.next);
            cur.next=newnode;

        }

        public void deleteAtIndex(int index){
            cur=head;
            if(index<0||index>=size){
                return;
            }
            for(int i=0;i<index;i++){
                cur=cur.next;
            }
            cur.next=cur.next.next;
            size--;
        }
    }
    @Test
    public void test(){
        MyLinkedList linkedList=new MyLinkedList();
        linkedList.addAtHead(1);
        linkedList.addAtTail(3);

        linkedList.addAtIndex(1,2);
        linkedList.deleteAtIndex(1);

        for(int i=0;i<linkedList.size;i++){
            System.out.print(linkedList.get(i));
        }
    }
}
