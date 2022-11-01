package BackTracking;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class Combination_Sum_40 {
    List<List<Integer>> result=new ArrayList<>();
    LinkedList path=new LinkedList();
    boolean[] used;
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        used=new boolean[candidates.length];
        Arrays.fill(used,false);
        Arrays.sort(candidates);
        process(candidates,target,0,0);
        return result;
    }

    private void process(int[] candidates, int target, int sum, int index) {
        if(sum==target){
            result.add(new ArrayList<>(path));
            return;
        }

        for(int i=index;i<candidates.length;i++){
            if(sum+candidates[i]>target){
                break;
            }
            if(i>0&&candidates[i]==candidates[i-1]&&!used[i-1]){
                continue;
            }
            path.add(candidates[i]);
            used[i]=true;
            process(candidates,target,sum+candidates[i],i+1);
            used[i]=false;
            path.removeLast();
        }
    }
}
