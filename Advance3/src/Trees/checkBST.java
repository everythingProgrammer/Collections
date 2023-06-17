package Trees;

import java.util.ArrayList;
import java.util.Stack;

public class checkBST {

    public boolean inorderTraversal(TreeNode A) {

        TreeNode curr ;
        Stack<TreeNode> s = new Stack<>();
        curr = A;
        boolean flag = true;
        TreeNode prev = null;
//        ArrayList<Integer> Order = new ArrayList<>();
        while(!s.isEmpty() || curr != null){

            while(curr!=null){
                s.add(curr);
                curr = curr.left;
            }
            curr = s.pop();
//            Order.add(curr.val);
            if(prev!=null && curr.val<=prev.val){
                flag = false;
                return false;
            }
            prev = curr;
            curr  = curr.right;
        }
        return flag;
    }

}
