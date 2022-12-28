package Trees;

import java.util.ArrayList;
import java.util.Stack;

public class ValidBinarySearchTree {
    // Storing Inorder Traversal ... not the best way ..
    public int isValidBST(TreeNode A) {

        // Storing Inorder and then checking Inorder taversal should be increasing

        TreeNode current, node;
        ArrayList<Integer> res = new ArrayList<>();
        current = A;
        while (current != null) {
            if (current.left == null) {
                res.add(current.val);
                current = current.right;
            } else {
                node = current.left;
                while (node.right != null && !current.equals(node.right))
                    node = node.right;

                if (node.right == null) {
                    node.right = current;
                    current = current.left;
                } else {
                    current = node.right;
                    node.right = null;
                    res.add(current.val);
                    current = current.right;
                }
            }
        }
        for(int i = 1 ; i<res.size(); i++){
            if(res.get(i-1)>res.get(i)){
                return 0;
            }
        }
        return 1;
    }

    //

}
