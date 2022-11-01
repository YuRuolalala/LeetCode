package StackAndQue.List_Stack_Que;

import java.util.ArrayList;

public class MyStack {
    private ArrayList<Object> list=new ArrayList<>();
    private int cur=0;

    public MyStack(ArrayList<Object> list, int cur) {
        this.list = list;
        this.cur = cur;
    }

    public MyStack() {
    }

    public boolean empty(){
        if(cur==0){
            return true;
        }
        return false;
    }

    public Object peek(){
        return list.get(cur-1);
    }

    public Object pop(){
        Object temp= list.get(cur-1);
        list.remove(cur-1);
        cur--;
        return temp;
    }

    public Object push(Object element){
        list.add(element);

        return list.get(cur++);
    }

    public int search(Object element){
        for(int i=1;i<list.size();i++){
            if(list.get(i).equals(element)){
                return i;
            }
        }
        return -1;
    }
}
