import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class RightViewofBt {

    public ArrayList<Integer> solve(TreeNode A) {

        ArrayList<Integer> list = new ArrayList<>();
        Queue<TreeNode> q = new LinkedList<>();

        TreeNode prev = null;

        q.add(A);
        q.add(null);
        prev = A;
        while(q.size()>0){
            TreeNode curr = q.poll();
            if(curr!=null){
                prev = curr;
            }
            if(curr==null){
                list.add(prev.val);
                if(q.size() >0)
                    q.add(null);
            }
            else{
                if(curr.left!=null){
                    q.add(curr.left);
                }
                if(curr.right!=null){
                    q.add(curr.right);
                }
            }

        }
        return list;

    }




    public ArrayList<Integer> solve2(TreeNode A) {

        Queue<TreeNode> q = new LinkedList<>();
        TreeNode prev = null;
        ArrayList<Integer> list = new ArrayList<>();
        q.add(A);
        q.add(null);
        while( q.size()>1 ){
            TreeNode curr = q.poll();
            if(curr == null ){

                list.add(prev.val);
                prev = curr;
                q.add(null);
            }else{
                if(prev == null){
                    prev = curr;
                }
                if(curr.right!=null && curr.right.val!=-1){
                    q.add(curr.right);
                }
                if(curr.left!=null && curr.left.val!= -1){
                    q.add(curr.left);
                }
            }

        }
        list.add(prev.val);
        return list;
    }


}
