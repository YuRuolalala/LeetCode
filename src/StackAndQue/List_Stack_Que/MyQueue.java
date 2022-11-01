package StackAndQue.List_Stack_Que;

public class MyQueue {
    private MyStack myStack1=new MyStack();
    private MyStack myStack2=new MyStack();

    public MyQueue(MyStack myStack1, MyStack myStack2) {
        this.myStack1 = myStack1;
        this.myStack2 = myStack2;
    }

    public MyQueue() {
    }

    public void push(int x){
        myStack1.push(x);
    }

    public int pop(){
        if(myStack2.empty()){
            while(!myStack1.empty()){
                myStack2.push(myStack1.pop());
            }
        }
        return (int) myStack2.pop();
    }

    public int peek(){
        if(!myStack2.empty()){
            return (int) myStack2.peek();
        }
        else {
            while(!myStack1.empty()){
                myStack2.push(myStack1.pop());
            }
        }
        return (int) myStack2.peek();
    }

    public boolean empty(){
        if(myStack1.empty()&&myStack2.empty()){
            return true;
        }
        return false;
    }
}
