package test.retry;

public class search_704 {
    public int search(int[] nums,int target){

        int n=nums.length;
        int L=0;
        int R=n-1;
        while (L<=R){
            int M=L+((R-L)>>1);
            if(nums[M]<target){
                L=M+1;
            }else
            if(nums[M]>target){
                R=M-1;
            }else {
                return M;
            }
        }
        return -1;
    }
}
