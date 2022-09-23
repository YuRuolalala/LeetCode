package String_;

import org.junit.Test;

public class Reverse_String_344 {

    public void reverseString(char[] s) {
        int left=0;int right=s.length-1;
        while(left<right){
            swap(s,left,right);
            left++;
            right--;
        }
    }
    public static void swap(char[]s,int x,int y){
        char temp;
        temp=s[x];
        s[x]=s[y];
        s[y]=temp;
    }

    @Test
    public void test(){
        char[] s=new char[]{'h','e','l','l','o'};
        for(int i=0;i<s.length;i++){
            System.out.print(s[i]);
        }
        System.out.println();
        reverseString(s);
        for(int i=0;i<s.length;i++){
            System.out.print(s[i]);
        }
    }
}
