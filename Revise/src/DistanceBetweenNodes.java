public class DistanceBetweenNodes {


    public int solve(TreeNode A, int B, int C) {

        if(A==null || A.val ==-1){
            return 0;
        }


        if(A.val<B && A.val<C){
            solve(A.right, B, C);
        }else if(A.val > B && A.val > C){
            solve(A.left , B, C);
        }
        else {
            if(B<A.val){
                return findDist(A.left,B,1) + findDist(A.right,C,1);
            }else{
                return findDist(A.left,C,1)+ findDist(A.right,B,1);
            }
        }
        return 0;


    }


    public int findDist(TreeNode root , int search  , int dist){
        if(root == null || root.val == -1){
            return 0;
        }
        if(root.val == search){
            return dist ;
        }
        int distance = 0;
        if(search> root.val){
            distance =findDist(root.right,search,dist+1);
        }else{
            distance = findDist(root.left,search,dist+1);
        }
        return distance;
    }


}
