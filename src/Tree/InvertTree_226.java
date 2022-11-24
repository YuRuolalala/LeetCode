package Tree;

public class InvertTree_226 {

    public TreeNode invertTree(TreeNode root) {
        if(root==null){
            return null;
        }
        invertTree(root.getLc());
        invertTree(root.getRc());
        swapChildren(root);
        return root;
    }

    private void swapChildren(TreeNode root) {
        TreeNode temp=root.getLc();
        root.setLc(root.getRc());
        root.setRc(temp);
    }
}
