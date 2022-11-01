package BackTracking;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class Combination_Sum_39 {
    List<List<Integer>> result=new ArrayList<>();
    LinkedList<Integer> path=new LinkedList<>();

    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        Arrays.sort(candidates);
        process(candidates,target,0,0);

        return result;
    }

    private void process(int[] candidates, int target,int sum,int Index) {
        if(sum==target){
            result.add(new ArrayList<>(path));
            return;
        }
        for(int i=Index;i<candidates.length;i++){
            if(sum+candidates[i]>target){
                break;
            }
            path.add(candidates[i]);
            process(candidates,target,sum+candidates[i],i);
            path.removeLast();
        }
    }

    public static void main(String[] args) {
        Combination_Sum_39 x=new Combination_Sum_39();
        int[] arry={2,3,5};
        int target=8;
        System.out.println(x.combinationSum(arry,target));
    }
}
