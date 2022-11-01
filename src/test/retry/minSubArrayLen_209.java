package test.retry;

import org.junit.Test;

public class minSubArrayLen_209 {

    public int minSubArrayLen(int target, int[] nums) {
        int left=0;
        int sum=0;
        int result=Integer.MAX_VALUE;
        for(int right=0;right<nums.length;right++){
            sum=sum+nums[right];
            while (sum>=target){
                result = Math.min(result,right-left+1);
                sum=sum-nums[left++];
            }
        }
        return result==Integer.MAX_VALUE?0:result;
    }



    public int minSubArrayLen02(int target, int[] nums) {
        int count=0;
        int n=nums.length;
        int min=Integer.MAX_VALUE;
        int sum=0;
        boolean judge=false;
        for(int i=0;i<n;i++){
            count=0;
            sum=0;
            for(int j=i;j<n;j++){
                sum=sum+nums[j];
                count++;
                if(sum>=target){
                    min=Math.min(min,count);
                    judge=true;
                }
            }
        }

        if(judge==false){
            return 0;
        }
        return min;
    }

    @Test
    public void test(){
        int target=7;
        int[] nums={2,3,1,2,4,3};
        minSubArrayLen02(target,nums);
    }
}
