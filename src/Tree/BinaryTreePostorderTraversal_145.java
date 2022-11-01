package Tree;

import java.util.ArrayList;
import java.util.List;

public class BinaryTreePostorderTraversal_145 {
    public List<Integer> postorderTraversal(TreeNode root) {
        ArrayList<Integer> list=new ArrayList<>();
        process(root,list);
        return list;
    }

    private void process(TreeNode root, ArrayList<Integer> list) {
        if(root==null){
            return;
        }
        process(root.getLc(),list);
        process(root.getRc(),list);
        list.add(root.getVal());
    }
}
