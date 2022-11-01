package test.retry;

import java.util.ArrayList;

public class Changespace {
    public String replaceSpace(String s) {
        StringBuilder sb=new StringBuilder();
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)!=' '){
                sb.append(s.charAt(i));
            }else {
                sb.append("%20");
            }
        }
        return new String(sb.toString());
    }
}
