package Trees;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Stack;

public class PreOrder {


    public ArrayList<Integer> preorderTraversal(TreeNode A) {

        TreeNode curr = A;
        Stack<TreeNode> s = new Stack<>();
        ArrayList<Integer> order = new ArrayList<>();
        while(! s.isEmpty() && curr!=null){

            while(curr!=null){
                s.add(curr);
                order.add(curr.val);
                curr = curr.left;


            }
            curr = s.pop();
            curr= curr.right;
        }
        return order;

    }
}
