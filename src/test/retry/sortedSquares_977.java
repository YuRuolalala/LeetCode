package test.retry;

import java.lang.reflect.Array;
import java.util.Arrays;

public class sortedSquares_977 {

    public int[] sortedSquares(int[] nums) {
        int[] ans=new int[nums.length];
        for(int i=0;i<ans.length;i++){
            ans[i]=nums[i]*nums[i];
        }
        Arrays.sort(ans);
        return ans;
    }

    public int[] sortedSquares2(int[] nums){
        int[] ans=new int[nums.length];
        int l=0; int r=nums.length-1;
        int k=r;
        while (l<=r){
            if(nums[r]*nums[r]>nums[l]*nums[l]){
                ans[k--]=nums[r]*nums[r];
                r--;
            }else {
                ans[k--]=nums[l]*nums[l];
                l++;
            }
        }
        return ans;
    }
}
