package Array.BinarySearch;

public class Sqrt_x_69 {

    public static int mySqrt(int x) {
        if(x<1){
            return 0;
        }
        int L=1;
        int R=x/2;

        while(L<R){
            int M=(L+R+1)/2;
            int S=M*M;
            if(S>x) {
                R = M - 1;
            }else {
                L=M;
            }
        }
        return (int)L;
    }

    public static void main(String args[]){
        System.out.print(mySqrt(16));
    }
}
