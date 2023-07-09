public class SymmetricBinaryTree {


    public int isSymmetric(TreeNode A) {

        boolean result = checkSymmetric(A.left,A.right);
        if(result ){
            return 1;
        }
        return 0;
    }
    public boolean checkSymmetric(TreeNode leftNode , TreeNode rightNode ){

        if(leftNode.val ==-1 && rightNode.val == -1){
            return true;
        }else if(leftNode.val != rightNode.val){
            return false;
        }

//        if(leftNode.right != rightNode.left || leftNode.left != rightNode.right){
//            return false;
//        }

        boolean result = checkSymmetric(leftNode.left,rightNode.right) && checkSymmetric(leftNode.right,rightNode.left);

        return result;

    }
}
