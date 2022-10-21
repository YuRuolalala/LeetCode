package test.retry;

import org.junit.Test;

public class removeDuplicates_26 {
    public int removeDuplicates(int[] nums) {

        int count=1;
        int fast=0;
        int slow=0;
        for(fast=1;fast<nums.length;fast++){
            if(nums[fast]!=nums[slow]){
                slow++;
                nums[slow]=nums[fast];
                count++;
            }
        }

        return count;
    }

    @Test
    public void test(){
        int[] a={1,1,2};
        removeDuplicates(a);
    }
}
