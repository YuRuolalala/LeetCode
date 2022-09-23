package String_;

import org.junit.Test;

//给定两个数组 nums1 和 nums2 ，返回 它们的交集 。输出结果中的每个元素一定是 唯一 的。我们可以 不考虑输出结果的顺序 。

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
