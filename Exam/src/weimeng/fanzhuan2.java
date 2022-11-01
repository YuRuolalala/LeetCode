package weimeng;

public class fanzhuan2 {
    public String reverseStr(String s, int k) {
        char[] array = s.toCharArray();
        int k2=k*2;
        for(int i=0;i<s.length();i=i+k2){
            if(i+k>s.length()){
                reverse(array,i,s.length()-1);
                break;
            }
            reverse(array,i,i+k-1);
        }

        return new String(array);
    }

    private void reverse(char[] array, int l, int r) {
        while (l<r){
            char temp=array[l];
            array[l]=array[r];
            array[r]=temp;
            l++;r--;
        }
    }
}
