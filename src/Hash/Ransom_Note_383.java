package Hash;

import org.junit.Test;

public class Ransom_Note_383 {
    public boolean canConstruct(String ransomNote, String magazine) {

        int [] record=new int [26];
        for(int i=0;i<magazine.length();i++){
            record[magazine.charAt(i)-'a']++;
        }
        for(int i=0;i<ransomNote.length();i++){
            record[ransomNote.charAt(i)-'a']--;
        }

        for(int i=0;i<record.length;i++){
            if(record[i]<0){
                return false;
            }
        }
        return true;
    }


    @Test
    public void test(){
        String a="abc";
        String b="aabc";
        System.out.print(canConstruct(a,b));
    }
}
