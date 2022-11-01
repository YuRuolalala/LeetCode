package test.retry;

public class backspaceCompare_844 {
    public boolean backspaceCompare(String s, String t) {
       return build(s).equals(build(t));
    }

    public  String build(String s){
        StringBuilder stringBuilder=new StringBuilder();
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)!='#'){
                stringBuilder.append(s.charAt(i));
            }else {
                if(stringBuilder.length()>0){
                    stringBuilder.deleteCharAt(stringBuilder.length()-1);
                }
            }
        }
        return stringBuilder.toString();
    }
}
