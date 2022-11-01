package test.retry;

public class removeElement_27 {

    public int removeElement(int[] nums, int val) {
        int fast;int slow=0;
        for(fast=0;fast<nums.length;fast++){
            if(nums[fast]==val){
                continue;
            }else {
                nums[slow]=nums[fast];
                slow++;
            }

        }
        return slow;
    }
}
