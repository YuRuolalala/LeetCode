package String_;

public class Reverse_Words_in_a_String_151 {
    public String reverseWords (String s) {
        char[] arr=s.toCharArray();
        int newspace=0;
        int lastspace=0;
        rever(arr,0,arr.length-1);
        for(int i=0;i<s.length();i++){
            if(arr[i]==' '){
                newspace=i;
                rever(arr,lastspace,newspace-1);
                lastspace=newspace+1;
            }
            if(i==s.length()-1){
                rever(arr,lastspace,i);
            }
        }

        return new String(arr);
    }

    public static void rever(char[] arr,int x,int y){
        for(;x<y;x++,y--){
            char temp=arr[x];
            arr[x]=arr[y];
            arr[y]=temp;
        }
    }
}
