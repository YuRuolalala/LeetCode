package Xinhuasan;

import org.junit.Test;

public class test01 {
    public String reverseWords (String s) {
        char[] arr=s.toCharArray();
        int newspace=0;
        int lastspace=0;
        for(int i=0;i<s.length();i++){
            if(arr[i]==' '){
                newspace=i;
                rever(arr,lastspace,newspace-1);
                lastspace=newspace+1;
                System.out.println("交换拉");
            }
            if(i==s.length()-1){
                rever(arr,lastspace,i);
            }
        }

        return new String(arr);
    }

    public static void rever(char[] arr,int x,int y){
        for(;x<y;x++,y--){
            char temp=arr[x];
            arr[x]=arr[y];
            arr[y]=temp;
        }
    }

    @Test
    public void test(){
        String s="hello worlddasdas aa";
        String t=reverseWords(s);
        System.out.println(s);
        System.out.println(t);
    }
}
