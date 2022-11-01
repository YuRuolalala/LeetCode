package StackAndQue.List_Que_Stack;

import java.util.ArrayList;

public class Que {
    private ArrayList list=new ArrayList();
    private int cur=0;
    private int start=0;
    private int size=cur-start;
    public void add(Object x){
        list.add(x);
        cur++;
        size=cur-start;
    }

    public int getSize() {
        return size;
    }

    public int poll(){
        int i= (int) list.get(start);
        start++;
        size=cur-start;
        return i;
    }

    public int peek(){
        return (int) list.get(start);
    }

    public boolean empty(){
        return size==0;
    }
}
