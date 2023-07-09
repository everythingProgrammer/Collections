import com.sun.source.tree.Tree;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Stack;

public class LCABT {

    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {


        Stack<TreeNode> stack = new Stack<>();
        ArrayList<TreeNode> a = new ArrayList<>();
        ArrayList<TreeNode> b = new ArrayList<>();

        TreeNode curr = root;

        /*
            Finding for p first
         */
        searchRoute(root,a,p);

        searchRoute(root,b,q);

        Collections.reverse(a);
        Collections.reverse(b);
        int smallerLength = a.size()<b.size()?a.size():b.size();

        for(int i = 0 ; i<smallerLength ; i++){
            if(a.get(i).val!=b.get(i).val){
                return a.get(i-1);
            }
        }

        return null;
    }

    public boolean searchRoute(TreeNode root, ArrayList<TreeNode> path, TreeNode s){

        if(root == null){
            return false;
        }

        if(root.val == s.val){
            path.add(root );
            return true;
        }

        if(root.left!= null && searchRoute(root.left,path, s)){
            path.add(root );
            return true;
        }
        if(root.right!=null && searchRoute(root.right,path,s)){
            path.add(root );
            return true;
        }
        return false;


    }


    // Bottoms up Approach
    public TreeNode bottomsUpApproach(TreeNode root, TreeNode p , TreeNode q){
        if (root == null || root == p || root == q) {
            return root;
        }

        TreeNode left = lowestCommonAncestor(root.left, p, q);
        TreeNode right = lowestCommonAncestor(root.right, p, q);

        if (left != null && right != null) {
            return root; // Both nodes are present in different subtrees, so the current root is the LCA
        } else if (left != null) {
            return left; // Only the left node is present in the subtree, so the LCA is in the left subtree
        } else {
            return right; // Only the right node is present in the subtree, so the LCA is in the right subtree
        }

    }

}
