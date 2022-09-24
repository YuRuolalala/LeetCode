package Xinhuasan;

import org.junit.Test;

public class test03 {
    public int reverse (int x) {
        // write code here
        int y=0;
        int sum=0;
        while(x/10!=0){
            y=x%10;
            sum=sum*10+y;
            x=x/10;
        }
        sum=sum*10+x;
        return sum;
    }

    @Test
    public void test(){
        int x=123;
        int y=-123;
        int a=120;
        int b=0;
        System.out.println(reverse(x));
        System.out.println(reverse(y));
        System.out.println(reverse(a));
        System.out.println(reverse(b));
    }
}
