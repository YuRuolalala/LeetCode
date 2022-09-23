package String_;

import org.junit.Test;

public class Reverse_String_II_541 {


//    给定一个字符串 s 和一个整数 k，从字符串开头算起，每计数至 2k 个字符，就反转这 2k 字符中的前 k 个字符。
//
//    如果剩余字符少于 k 个，则将剩余字符全部反转。
//    如果剩余字符小于 2k 但大于或等于 k 个，则反转前 k 个字符，其余字符保持原样。
//
//    来源：力扣（LeetCode）
//    链接：https://leetcode.cn/problems/reverse-string-ii
//    著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
    public String reverseStr(String s, int k) {
        char[] arr=s.toCharArray();
        int k2=k*2;
        for(int i=0;i<s.length();i=i+k2){
            if(i+k-1>s.length()-1){
                reverseString(arr,i,s.length()-1);
                break;
            }

            reverseString(arr,i,i+k-1);
        }
        return new String(arr);
    }

    public void reverseString(char[] s,int i,int j) {
      for(;i<j;i++,j--){
          char temp=s[i];
          s[i]=s[j];
          s[j]=temp;
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
        String s="abcdefg";
        int key=2;
        String t=reverseStr(s,key);
        System.out.println(s);
        System.out.println(t);
    }
}
