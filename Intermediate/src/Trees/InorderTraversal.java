package Trees;

import java.util.ArrayList;

public class InorderTraversal {
    public class TreeNode {

        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(){
            val = 0;
            left = null;
            right  = null;
        }
    }
    public ArrayList<Integer> inorderTraversal(TreeNode A) {

        if(A.left == null && A.right == null){
            ArrayList<Integer> ans = new ArrayList<>();
            ans.add(A.val);
            return ans;
        }
        ArrayList<Integer> ans = new ArrayList<>();
        if(A.left != null){
            ArrayList<Integer> left = inorderTraversal(A.left);
            for(int n: left){
                ans.add(n);
            }
        }
        ans.add(A.val);
        if(A.right !=null){
            ArrayList<Integer> right = inorderTraversal(A.right);
            for(int n: right){
                ans.add(n);
            }
        }

        return ans;
    }


}
