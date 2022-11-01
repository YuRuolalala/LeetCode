package weimeng;

public class fanzhuan1 {
    public static void reserve(char[] s){
        int l=0;
        int r=s.length-1;
        while(l<r){
            swap(s,l,r);
            l++;
            r--;
        }
    }
    public static void swap(char[] s,int x,int y){
        char temp=s[x];
        s[x]=s[y];
        s[y]=temp;
    }
}
