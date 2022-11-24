package Tree;

import java.util.Objects;

public class TreeNode {
    private int val;
    private TreeNode lc;
    private TreeNode rc;

    public TreeNode() {
    }

    public TreeNode(int val) {
        this.val = val;
    }

    public TreeNode(int val, TreeNode lc, TreeNode rc) {
        this.val = val;
        this.lc = lc;
        this.rc = rc;
    }

    public int getVal() {
        return val;
    }

    public TreeNode getLc() {
        return lc;
    }

    public TreeNode getRc() {
        return rc;
    }

    public void setVal(int val) {
        this.val = val;
    }

    public void setLc(TreeNode lc) {
        this.lc = lc;
    }

    public void setRc(TreeNode rc) {
        this.rc = rc;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        TreeNode treeNode = (TreeNode) o;
        return val == treeNode.val &&
                Objects.equals(lc, treeNode.lc) &&
                Objects.equals(rc, treeNode.rc);
    }

    @Override
    public int hashCode() {
        return Objects.hash(val, lc, rc);
    }
}
