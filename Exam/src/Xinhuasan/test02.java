package Xinhuasan;

import org.junit.Test;

public class test02 {
    public boolean isUnique (String str) {
        char[] arr=str.toCharArray();
        int[] result=new int[26];
        for(int i=0;i<arr.length;i++){
            result[arr[i]-'a']++;
        }
        for(int i=0;i<result.length;i++){
            if(result[i]>1){return false;}

        }
        return true;
    }

    @Test
    public void test(){
        String s="abc";
        String t="nowcoder";
        System.out.println(isUnique(s));
        System.out.println(isUnique(t));
    }
}
