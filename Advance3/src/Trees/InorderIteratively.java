package Trees;

import java.util.ArrayList;
import java.util.Stack;

public class InorderIteratively {


    public ArrayList<Integer> inorderTraversal(TreeNode A) {

        TreeNode curr ;
        Stack<TreeNode> s = new Stack<>();
        curr = A;
        ArrayList<Integer> Order = new ArrayList<>();
        while(!s.isEmpty() || curr != null){

            while(curr!=null){
                s.add(curr);
                curr = curr.left;
            }
            curr = s.pop();
            Order.add(curr.val);
            curr  = curr.right;
        }
        return Order;
    }
}
