package test.retry;

public class moveZeroes_283 {
    public void moveZeroes(int[] nums) {
        int fast=0;
        int slow=0;
        for(;fast<nums.length;fast++){
            if(nums[fast]!=0){
                nums[slow]=nums[fast];
                slow++;
            }
        }
        for(;slow<nums.length;slow++){
            nums[slow]=0;
        }
    }
}
