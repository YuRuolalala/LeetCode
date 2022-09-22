package Hash;

import org.junit.Test;

import java.util.HashSet;
import java.util.Set;

public class Happy_Number_202 {

    public boolean isHappy(int n) {
        int sum=0;
        int count=0;
        while(n!=0){
            count++;
            int x=n%10;
            sum=sum+x*x;
//            System.out.println(sum);
            if(n==1&&x==1&&sum==1){
                return true;
            }
            n=n/10;
            if(n==0){
                n=sum;
                sum=0;
            }
            if(count==10000){
                return false;
            }
        }
      return true;
    }


    public boolean isHappy1(int n){
        Set<Integer> record=new HashSet<>();
        while(n!=1&&!record.contains(n)){
            record.add(n);
            n=getNextNumber(n);
        }
        return n==1;
    }

    private int getNextNumber(int n){
        int res=0;
        while(n>0){
            int temp=n%10;
            res+=temp*temp;
            n=n/10;
        }
        return res;
    }

    @Test
    public void test(){
        int n=2;
        System.out.print(isHappy(n));
    }
}
