package test.retry;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;

public class Sliding_Window_Maximum_239 {
    ArrayList<Integer> result=new ArrayList<Integer>();
    LinkedList<Integer> window=new LinkedList<>();
    public int[] maxSlidingWindow(int[] nums, int k) {
        for(int i=0;i<k;i++){
            window.add(nums[i]);
        }
        int[] temp=new int[k];
        for(int i=0;i<k;i++){
            temp[i]=window.get(i);
        }
        Arrays.sort(temp);
        result.add(temp[2]);
        for(int i=k;i<nums.length;i++){
            window.add(nums[i]);
            window.removeFirst();
            int[] tp=new int[k];
            for(int j=0;j<k;j++){
                tp[j]=window.get(j);
            }
            Arrays.sort(tp);
            result.add(tp[2]);
        }


        int n=result.size();
        int[] ans=new int[n];
        for(int i=0;i<n;i++){
            ans[i]=result.get(i);
        }
        return ans;
    }

    public static void main(String[] args) {
        Sliding_Window_Maximum_239 x = new Sliding_Window_Maximum_239();
        int[] nums={1,3,-1,-3,5,3,6,7};
        int key=3;
        System.out.println(x.maxSlidingWindow(nums,key));
    }
}
