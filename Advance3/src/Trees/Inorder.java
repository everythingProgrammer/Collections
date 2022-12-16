package Trees;


import java.util.ArrayList;

public class Inorder {
    public ArrayList<Integer> inorderTraversal(TreeNode A) {

        ArrayList<Integer> ans = new ArrayList<>();
        return traversal(A, ans);

    }

    public ArrayList<Integer> traversal ( TreeNode root , ArrayList<Integer>ans ){

        if(root == null){
            return ans;
        }
        traversal(root.left , ans);
        ans.add(root.val);
        traversal(root.right, ans);
        return ans;

    }
}
