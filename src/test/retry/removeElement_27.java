package test.retry;

public class removeElement_27 {

    public int removeElement(int[] nums, int val) {
        int fast;
        int slow=0;
        int count=0;
        for(fast=0;fast<nums.length;fast++){
            nums[slow]=nums[fast];
            if(nums[fast]!=val){
                slow++;
                count++;
            }
        }
       return count;

    }
}
