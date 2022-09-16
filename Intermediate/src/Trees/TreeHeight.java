package Trees;

public class TreeHeight {
    public int solve(TreeNode A) {


        int rightHeight= 0;
        int leftHeight = 0;
        if(A.right != null){
            rightHeight  = solve(A.right);
        }
        if(A.left != null){
            leftHeight = solve(A.left);
        }
        return Math.max(leftHeight,rightHeight)+1;

    }
}
