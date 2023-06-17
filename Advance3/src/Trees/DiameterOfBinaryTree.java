package Trees;

public class DiameterOfBinaryTree {

    int maxGlobalHeight = 0;
    public int solve(TreeNode A) {
        calcMaxHeight(A);
        return this.maxGlobalHeight;

    }


    public int calcMaxHeight(TreeNode A){


        if(A == null){
            return -1;
        }
        if(A.left == null && A.right == null){
            return 0;
        }
        int leftHeight = -1;
        int rightHeight = -1;
          leftHeight = calcMaxHeight(A.left);
          rightHeight = calcMaxHeight(A.right);

        this.maxGlobalHeight = Math.max( Math.max(leftHeight,rightHeight)+1,maxGlobalHeight );

        return Math.max(leftHeight,rightHeight)+1;
    }


}
