package test.retry;

public class searchRange_34 {
    public int[] searchRange(int[] nums, int target) {
        int[] ans=new int[2];

        int n=nums.length;
        if(n==0){
            ans[0]=-1;
            ans[1]=-1;
            return ans;
        }
        int L=0;
        int R=n-1;
        int M=L+((R-L)>>1);
        while(L<=R){
            M=L+((R-L)>>1);
            if(nums[M]<target){
                L=M+1;
            }
            if(nums[M]>target){
                R=M-1;
            }
            if(nums[M]==target){
                break;
            }
        }
        if(nums[M]!=target){
            ans[0]=-1;
            ans[1]=-1;
            return ans;
        }
        int i=M;
        while(nums[i]==target){
            ans[0]=i--;
        }
        i=M;
        while (nums[i]==target){
            ans[1]=i++;
        }



        return ans;
    }
}
