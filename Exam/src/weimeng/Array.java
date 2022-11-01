package weimeng;

import java.util.ArrayList;
import java.util.LinkedList;

public class Array {


    public static void main(String[] args) {
        ArrayList arrayList=new ArrayList();
        LinkedList linkedList=new LinkedList();
        for(int i=0;i<10000;i++){
            arrayList.add("a");
            linkedList.add("a");
        }
        long start=System.currentTimeMillis();
        for(int i=0;i<100000;i++){
            arrayList.add(0,"a");
        }
        long end=System.currentTimeMillis();
        long timeab=end-start;

        start=System.currentTimeMillis();
        for(int i=0;i<100000;i++){
            linkedList.add(0,"a");
        }
        end=System.currentTimeMillis();
        long timelb=end-start;



        start=System.currentTimeMillis();
        for(int i=0;i<10000;i++){
            arrayList.add(arrayList.size()/2,"a");
        }
        end=System.currentTimeMillis();
        long timeam=end-start;

        start=System.currentTimeMillis();
        for(int i=0;i<10000;i++){
            linkedList.add(linkedList.size()/2,"a");
        }
        end=System.currentTimeMillis();
        long timelm=end-start;


        start=System.currentTimeMillis();
        for(int i=0;i<100000;i++){
            arrayList.add("a");
        }
        end=System.currentTimeMillis();
        long timeae=end-start;

        start=System.currentTimeMillis();
        for(int i=0;i<100000;i++){
            linkedList.add("a");
        }
        end=System.currentTimeMillis();
        long timele=end-start;

        System.out.println("Arraylist在首部添加元素用时："+timeab);
        System.out.println("Linkedlist在首部添加元素用时："+timelb);

        System.out.println("Arraylist在中部添加元素用时："+timeam);
        System.out.println("Linkedlist在中部添加元素用时："+timelm);


        System.out.println("Arraylist在尾部添加元素用时："+timeae);
        System.out.println("Linkedlist在尾部添加元素用时："+timele);
    }
}
