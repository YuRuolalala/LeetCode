package test.retry;

public class Reverse_Words_in_a_String_151 {
    public static String reverseWords(String s) {
        StringBuilder sb=new StringBuilder();
        String temp0=removeextspace(s);
        String temp1=rever(temp0,0,temp0.length()-1);
        int cut=0;
        for(int i=0;i<temp1.length();i++){
            if(temp1.charAt(i)==' '){

                sb.append(rever(temp1,cut,i-1));
                if(cut==0){
                    sb.append(" ");
                }
                cut=i;
            }
            if(i==temp1.length()-1){
                sb.append(rever(temp1,cut,i));
            }

        }
        return removeextspace(sb.toString());
    }
    public static String rever(String s,int x,int y){
        char[] array =new char[y-x+1];
        for(int i=0;i<array.length;i++){
            array[i]=s.charAt(y);
            y--;
        }
        return new String(array);
    }

    public static String removeextspace(String s){
        StringBuilder sb=new StringBuilder();
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)==' '&&sb.length()==0){
                continue;
            }

            if(s.charAt(i)==' '){
                while(s.charAt(i)==' '){
                    i++;
                    if(i==s.length()){
                        break;
                    }

                }
                if(i==s.length()){
                    break;
                }
                i--;
            }
            sb.append(s.charAt(i));
        }

        return sb.toString();
    }

    public static void main(String[] args) {
        String s="the sky is   blue  ";
        String blue="eulb";
        String x=removeextspace(s);
        String a=rever(s,0,s.length()-1);
        String t=reverseWords(s);

        System.out.println(a);
        System.out.println(rever(blue,0,blue.length()-1));
        System.out.println(t);

//        String s="eulb si yks";
//        System.out.println(rever(s,0,4));
    }
}
