package Tree;

import java.util.ArrayList;
import java.util.List;

public class BinaryTreeLevelOrderTraversal_102 {
    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> list=new ArrayList<>();
        process(root,0,list);

        return list;
    }

    private void process(TreeNode root, int deep, List<List<Integer>> list) {
        if(root==null){
            return;
        }
        deep++;
        if(list.size()<deep){
            List<Integer> item=new ArrayList<Integer>();
            list.add(item);
        }
        list.get(deep-1).add(root.getVal());
        process(root.getLc(),deep,list);
        process(root.getRc(),deep,list);
    }
}
