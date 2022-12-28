package Trees;

public class BalancedBinaryTree {

    // true signifies Balanced Binary Tree
    boolean flag = true;



    public int isBalanced(TreeNode A) {

        getBalance(A);
        if(this.flag){
            return 1;
        }
        return 0;

    }

    public int getBalance(TreeNode node){


        if(node == null){
            return 0;

        }

        int left_height = getBalance(node.left);
        int right_height = getBalance(node.right);

        if(Math.abs(left_height-right_height) >1){
            this.flag = false;
        }
        return Math.max(left_height,right_height)+1;



    }


}
