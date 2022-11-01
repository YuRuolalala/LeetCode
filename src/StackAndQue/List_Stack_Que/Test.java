package StackAndQue.List_Stack_Que;

public class Test {
    public static void main(String[] args) {
//        MyStack myStack = new MyStack();
//        System.out.println(myStack.empty());
//        myStack.push(0);
//        System.out.println(myStack.peek());
//        myStack.push(2);
//        System.out.println(myStack.push(3));
//        myStack.push(2);
//        System.out.println(myStack.search(2));
//        myStack.pop();
//        System.out.println(myStack.peek());


        MyQueue myQueue=new MyQueue();
        myQueue.push(1);
        System.out.println(myQueue.peek());
        myQueue.push(2);
        System.out.println(myQueue.peek());
        System.out.println(myQueue.pop());
        System.out.println(myQueue.empty());
    }
}
