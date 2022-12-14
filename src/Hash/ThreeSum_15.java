package Hash;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ThreeSum_15 {

    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> result=new ArrayList<>();
        Arrays.sort(nums);

        for(int i=0;i<nums.length;i++){
            if(nums[i]>0){
                return result;
            }
            if(i>0&&nums[i]==nums[i-1]){
                continue;
            }
            int left=i+1;
            int right=nums.length-1;

            while(left<right){
                int sum=nums[i]+nums[left]+nums[right];
                if(sum>0){
                    right--;
                }
                if(sum<0){
                    left++;
                }if(sum==0) {
                    result.add(Arrays.asList(nums[i],nums[left],nums[right]));

                    while(right>left&&nums[right]==nums[right-1]) right--;
                    while(right>left&&nums[left]==nums[left+1]) left++;

                    right--;
                    left++;

                }

            }
        }
        return  result;

    }
        @Test
        public void test(){
        int[] arr=new int[]{-1,0,1,2,-1,-4};
        System.out.print(threeSum(arr));
        }
}
