package test.retry;

public class searchInsert_35 {
    public int searchInsert(int[] nums, int target) {
        int n=nums.length;
        int L=0;
        int R=n-1;
        int M=L+((R-L)>>1);
        while (L<=R){
            M=L+((R-L)>>1);
            if(nums[M]<target){
                L=M+1;
            }else
            if(nums[M]>target){
                R=M-1;
            }else {
                return M;
            }
        }
        if(target>nums[M]){
            return M+1;
        }else {
            return M;
        }

    }


}
