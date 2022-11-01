package weimeng;

import com.sun.org.apache.bcel.internal.generic.RET;

public class Singleton01 {
    private Singleton01(){}
    private static final Singleton01 instance=new Singleton01();
    public Singleton01 getInstance(){
        return instance;
    }
}

class Singleton02{
    private Singleton02(){}
    private static volatile Singleton02 instance=null;
    public Singleton02 getInstance(){
        if(instance==null){
            synchronized (Singleton02.class){
                if(instance==null){
                    instance=new Singleton02();
                }
            }
        }
        return instance;
    }
}
