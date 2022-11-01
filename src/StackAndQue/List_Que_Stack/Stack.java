package StackAndQue.List_Que_Stack;

public class Stack {
    Que q=new Que();

    public Stack() {
    }

    public Stack(Que q) {
        this.q = q;
    }

    public void push(int x){
        q.add(x);
        int size=q.getSize();
        while (size-->1){
            q.add(q.poll());
        }
    }

    public int pop(){
        return q.poll();
    }

    public int top(){
        return q.peek();
    }

    public boolean empty(){
        return q.empty();
    }
}
