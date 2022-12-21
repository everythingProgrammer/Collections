package Trees;

import java.util.ArrayList;
import java.util.Stack;

public class PostOrderIterative {


    public ArrayList<Integer> postorderTraversal(TreeNode A) {

        Stack<TreeNode > s = new Stack<>();
        TreeNode temp = null;

        ArrayList<Integer> order = new ArrayList<>();

        TreeNode curr = A;

        while(  curr!= null || !s.isEmpty() ){


            if(curr!=null){
                while(curr!=null){
                    s.add(curr);
                    curr = curr.left;
                }
            }
            else{
                // if curr == null and  s.top.right == null
                temp = s.peek();
                // if s.top().right == null , then start popping values
                if(temp.right ==null){

                    order.add(temp.val);
                    s.pop();
                    while(!s.isEmpty() && temp == s.peek().right){
                        temp = s.pop();
                        order.add(temp.val);
                    }

                }else {
                    curr = temp.right;
                }

            }
        }

        return order;

        }
}
