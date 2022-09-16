package Trees;

import java.util.ArrayList;

public class PostOrderTraversal {
    public ArrayList<Integer> postorderTraversal(TreeNode A) {
        if(A.left == null && A.right == null){
            ArrayList<Integer> ans = new ArrayList<>();
            ans.add(A.val);
            return ans;
        }
        ArrayList<Integer> ans = new ArrayList<>();
        if(A.left != null){
            ArrayList<Integer> left = postorderTraversal(A.left);
            for(int n: left){
                ans.add(n);
            }
        }

        if(A.right !=null){
            ArrayList<Integer> right = postorderTraversal(A.right);
            for(int n: right){
                ans.add(n);
            }
        }
        ans.add(A.val);


        return ans;
    }



    
}
