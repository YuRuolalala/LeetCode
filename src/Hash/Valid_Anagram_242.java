package Hash;

import org.junit.Test;

import java.util.Arrays;

public class Valid_Anagram_242 {
    public boolean isAnagram(String s, String t) {
        int[] record=new int[26];
        for(int i=0;i<s.length();i++){
            record[s.charAt(i)-'a']++;
        }
        for(int i=0;i<t.length();i++){
            record[t.charAt(i)-'a']--;
        }
        for(int i=0;i<26;i++){
            if(record[i]!=0){
                return false;
            }
        }
        return true;
    }

    public boolean isAnagram1(String s, String t) {
        if (s.length() != t.length()) { return false; }

        char[] sChars = s.toCharArray();
        char[] tChars = t.toCharArray();
        Arrays.sort(sChars);
        Arrays.sort(tChars);
        return Arrays.equals(sChars, tChars);
    }


    @Test
    public void test(){
        String a="abc";
        String b="aabc";
        System.out.print(isAnagram(a,b));
    }
}
