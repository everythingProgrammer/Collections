package Trees;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Stack;

public class PreOrder {


    public static ArrayList<Integer> preorderTraversal(TreeNode A) {

        TreeNode curr = A;
        Stack<TreeNode> s = new Stack<>();
        ArrayList<Integer> order = new ArrayList<>();
        while(! s.isEmpty() || curr!=null){

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


    public static void main(String[] args) {
        TreeNode root = new TreeNode(10);
        root.left = new TreeNode(5);
        root.left.right = new TreeNode(8);
        root.left.right.left = new TreeNode(7);
        root.left.right.right = new TreeNode(9);
        root.right = new TreeNode(15);
        ArrayList<Integer> ans = preorderTraversal(root);
    }

}
