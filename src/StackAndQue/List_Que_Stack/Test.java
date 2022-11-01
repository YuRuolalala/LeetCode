package StackAndQue.List_Que_Stack;

public class Test {
    public static void main(String[] args) {
        Que que = new Que();
        que.add(1);
        que.add(2);
        que.add(3);
        System.out.println( que.peek());
        System.out.println( que.peek());
        System.out.println( que.empty());
        que.poll();
        System.out.println( que.peek());
    }
}
