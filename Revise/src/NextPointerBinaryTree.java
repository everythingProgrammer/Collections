import java.util.LinkedList;
import java.util.Queue;

public class NextPointerBinaryTree {

    public void connect(TreeLinkNode root) {


        Queue<TreeLinkNode> queue = new LinkedList<>();
        TreeLinkNode curr = root;
        queue.add(root);
        queue.add(null);
        root.next = null;

        while(queue.size()>1){

            curr = queue.poll();
            if(curr == null){
                queue.add(null);
            }else{
                if(curr.left!=null && curr.left.val != -1){
                    queue.add(curr.left);
                }
                if(curr.right!=null && curr.right.val != -1){
                    queue.add(curr.right);
                }
                curr.next = queue.peek();
            }


        }

    }
}
