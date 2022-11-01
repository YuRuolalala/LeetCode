package BackTracking;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Combinations_77 {
    List<List<Integer>> result=new ArrayList<>();
    LinkedList<Integer> path=new LinkedList<>();

    public List<List<Integer>> combine(int n, int k) {

        process(n,k, 1);
        return result;
    }

    private void process(int n, int k, int startIndex) {
        if(path.size()==k){
            result.add(new ArrayList<>(path));
            return;
        }
        for(int i=startIndex;i<n;i++){
            path.add(i);
            process(n,k,i+1);
            path.removeLast();
        }
    }
}
