public class LCABST {


    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        if (root.val < p.val && root.val < q.val) {
            return lowestCommonAncestor(root.right, p, q); // Both p and q are in the right subtree
        } else if (root.val > p.val && root.val > q.val) {
            return lowestCommonAncestor(root.left, p, q); // Both p and q are in the left subtree
        } else {
            return root; // Current root is the LCA
        }
    }
}
