public class InvertBinaryTree {

    public static TreeNode invertTree(TreeNode A) {


        if(A== null){
            return null;
        }
        invertTree(A.left);
        invertTree(A.right);
        TreeNode temp = A.left;
        A.left = A.right;
        A.right =temp;
        return A;

    }

    public static void main(String[] args) {
        TreeNode root = new TreeNode(5);
        root.left = new TreeNode(6);
        root.left.left = new TreeNode(-1);
        root.left.right = new TreeNode(-1);

        root.right = new TreeNode(7);
        root.right.left = new TreeNode(-1);
        root.right.right = new TreeNode(-1);

        invertTree(root);
    }
}
