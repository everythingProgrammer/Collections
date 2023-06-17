package Trees;

import java.util.ArrayList;

public class PathFromLeaf_t_oRoot {


    ArrayList<Integer> path = new ArrayList<>();
    public boolean getPath(TreeNode root, int val){

        if(root == null){
            return false;
        }
        if(root.val == val){
            path.add(root.val);
            return true;
        }
        if(getPath(root.left,val) ){
            path.add(root.val);
            return true;
        }
        if (getPath(root.right,val)) {
            path.add(root.val);
            return true;
        }
        return false;

    }


}
