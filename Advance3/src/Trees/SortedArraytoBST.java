package Trees;

import org.w3c.dom.Node;

public class SortedArraytoBST {

    public TreeNode sortedArrayToBST(final int[] A) {

        TreeNode root = null;

        root = assign(0,A.length-1 , A);

        return root;
    }

    public TreeNode assign(  int l , int r , int A[]){
        if(l>r){
            TreeNode n = null;
            return n;
        }
        int mid = (l+r)/2;
        TreeNode node = new TreeNode( A[mid] );
        node.left = assign(l,mid-1,A);
        node.right = assign(mid+1,r,A);
        return node;

    }



}
