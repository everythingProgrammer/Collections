package Trees;

import java.util.ArrayList;

public class PreOrderTraversal {

    public ArrayList<Integer> preorderTraversal(TreeNode A) {

        if(A.left == null && A.right == null){
            ArrayList<Integer> ans = new ArrayList<>();
            ans.add(A.val);
            return ans;
        }
        ArrayList<Integer> ans = new ArrayList<>();
        ans.add(A.val);
        if(A.left != null){
            ArrayList<Integer> left = preorderTraversal(A.left);
            for(int n: left){
                ans.add(n);
            }
        }

        if(A.right !=null){
            ArrayList<Integer> right = preorderTraversal(A.right);
            for(int n: right){
                ans.add(n);
            }
        }

        return ans;

    }
}
