package hongxin;

import java.util.Stack;

public class kuohaopipei {

    public static void judge(String s){

        int a=0;
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='('){
                a++;
            }
            if(s.charAt(i)==')'){
                a--;
            }
            if(a<0){
                System.out.println("右括号不匹配");
                return;
            }
        }
        if(a>0){
            System.out.println("左括号不匹配");
            return;
        }
        if(a==0){
            System.out.println("匹配");
        }
    }


    public static void main(String[] args) {

        Stack stack=new Stack();

        String s="x(((AAA)))";
        judge(s);
    }
}
