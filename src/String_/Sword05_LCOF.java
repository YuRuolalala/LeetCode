package String_;

import org.junit.Test;

public class Sword05_LCOF {
    public String replaceSpace(String s) {
        if(s==null){
            return null;
        }
        StringBuffer sb=new StringBuffer();
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)==' '){
                sb.append("%20");
            }else {
                sb.append(s.charAt(i));
            }
        }
        return sb.toString();
    }

    @Test
    public void test(){
        String s="we are happy";
        String t=replaceSpace(s);
        System.out.println(t);
    }
}
