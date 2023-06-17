import org.w3c.dom.Node;

import java.util.*;

public class VerticalOrder {

    /*
      This InOrder Traversal won't work correctly .
     */
    public static  List<List<Integer>> verticalTraversal(TreeNode root) {
        HashMap<Integer, ArrayList<Integer>> map = new HashMap<>();
        int level = 0;
        Stack<TreeNode>  stack = new Stack<>();
        TreeNode curr = root;

         int minLevel = 0;
        int maxLevel = 0;
        while( !stack.isEmpty()  || curr!=null  ){

            while(curr !=null){
                stack.push(curr);
                curr = curr.left;
                level --;
                if(level < minLevel){
                    minLevel = level;
                }
            }
            curr = stack.pop();
            level++;
            if(map.containsKey(level)){
                map.get(level).add(curr.val)   ;
            }else{
                 ArrayList<Integer> l = new ArrayList<>();
                 l.add(curr.val);
                 map.put(level,l);
            }
            if(curr.right!=null){
                 level++;
                if(level>maxLevel){
                    maxLevel = level;
                }
                curr = curr.right;
            }else{
                curr = null;
            }

        }

        /*
                Now using minLevel+1 -> maxLevel as keys of Hashmap retrieve ArrayLists and add to ArrayList of ArrayList
         */
        ArrayList< List<Integer>> ans = new ArrayList<>();
        minLevel++;
        for(;minLevel<=maxLevel; minLevel++ ){
            ans.add(map.get(minLevel));
        }

        return ans;
    }


    /*
           LevelOrder way
     */
   static class Pair<T, I extends Number> {


        TreeNode node;
        int level;

        Pair(TreeNode node  , int level){
            this.node = node;
            this.level = level;

        }

        public int getLevel(){
            return this.level;

        }

        public TreeNode getNode(){
            return this.node;
        }

    }
    public static List<List<Integer>> verticalTraversal2(TreeNode root) {



        HashMap<Integer,ArrayList<Integer>> map = new HashMap<>();

        Queue<Pair<TreeNode,Integer>> q = new LinkedList<>();

        q.add(new Pair(root,0));


        int minLevel = Integer.MAX_VALUE;
        int maxLevel = Integer.MIN_VALUE;

        while(!q.isEmpty()){

            Pair curr = q.peek();



            if(curr.node.left!=null){
                q.add(new Pair(curr.node.left,curr.level-1));
            }
            if(curr.node.right!=null){
                q.add(new Pair(curr.node.right,curr.level+1));
            }


            if(map.containsKey(curr.level)){
                map.get(curr.level).add(curr.node.val);
            }else{
                ArrayList<Integer> list = new ArrayList<>();
                list.add(curr.node.val);
                map.put(curr.level,list);
            }

            if(minLevel > curr.level){
                minLevel = curr.level;
            }
            if(curr.level > maxLevel){
                maxLevel = curr.level;
            }

            q.poll();
        }

        List<List<Integer>> list = new ArrayList<>();
        for(int i =minLevel ; i<=maxLevel ; i++){
            list.add(map.get(i));
        }

        return list;

    }

    public static void main(String[] args) {
//        TreeNode root = new TreeNode(3);
//        root.left = new TreeNode(9);
//        root.left.left = null;
//        root.left.right = null;
//
//        root.right = new TreeNode(20);
//        root.right.left = new TreeNode(15);
//        root.right.right = new TreeNode(17);

        TreeNode root = new TreeNode(1);

        root.left = new TreeNode(2);
        root.left.left  = new TreeNode(4);
        root.left.right = new TreeNode(5);
        root.left.left.left = null;
        root.left.left.right = null;
        root.left.right.left= null;
        root.left.right.right = null;

        root.right = new TreeNode(3);
        root.right.left = new TreeNode(6);
        root.right.right = new TreeNode(7);
        root.right.left.right = null;
        root.right.left.left = null;
        root.right.right.right = null;
        root.right.right.left = null;

        verticalTraversal2(root);
    }
}
