package test.retry;

public class isPerfectSquare_367 {
    public boolean isPerfectSquare(int num) {
        if(num==2){
            return false;
        }
        int L=0;
        int R=num;
        int M=0;
        int count=0;
        while (L<=R){
            M=L+((R-L)>>1);
            if((long)M*M<=num){
                L=M+1;
                count=M;
            }else {
                R=M-1;
            }
        }
        return count*count==num;
    }
}
