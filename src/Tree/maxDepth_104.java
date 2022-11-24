package Tree;

import static java.lang.Math.max;

public class maxDepth_104 {
    public int maxDepth(TreeNode root) {
        return getdepth(root);
    }

    private int getdepth(TreeNode root) {
        if(root==null){
            return 0;
        }
        int ld=getdepth(root.getLc());
        int rd=getdepth(root.getRc());
        int dept=1+max(ld,rd);
        return dept;
    }
}
