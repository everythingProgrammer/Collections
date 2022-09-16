package Trees;

public class IdenticalBinaryTree {


    public boolean compare(TreeNode A,TreeNode B){

        if(A== null && B == null){
            return true;
        }
        if((A==null && B!=null ) || (A!=null && B== null) ){
            return false;
        }
        if(A.val != B.val){
            return false;
        }
        return   compare(A.left,B.left)&&  compare(A.right,B.right);
    }

    public int isSameTree(TreeNode A, TreeNode B) {

        return compare(A,B)== true?1:0;

    }


}
