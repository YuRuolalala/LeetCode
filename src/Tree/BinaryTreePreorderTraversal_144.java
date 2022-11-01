package Tree;

import java.util.ArrayList;
import java.util.List;

public class BinaryTreePreorderTraversal_144 {

    public List<Integer> preorderTraversal(TreeNode root){
        ArrayList<Integer> list = new ArrayList<>();
        process(root,list);
        return list;
    }

    private void process(TreeNode root, ArrayList<Integer> list) {
        if(root==null){
            return;
        }
        list.add(root.getVal());
        process(root.getLc(),list);
        process(root.getRc(),list);
    }

}
