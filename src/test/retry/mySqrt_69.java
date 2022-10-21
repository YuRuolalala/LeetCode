package test.retry;

import org.junit.Test;

public class mySqrt_69 {
    public int mySqrt(int x) {
        int L=0;
        int R=x;
        int ans=0;
        while(L<=R){
            int M=L+((R-L)>>1);
            if((long)M*M<=x){
                L=M+1;
                ans=M;
            }
            else{
                R=M-1;
            }

        }
        return ans;
    }


    @Test
    public void test(){
        System.out.println(mySqrt(4));
    }
}
