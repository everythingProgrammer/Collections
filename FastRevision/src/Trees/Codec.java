package Trees;

public class Codec {

    public String serialize(TreeNode root) {
        return  serializeToString(root);
    }
    public String serializeToString(TreeNode node){


        if(node == null){
            return "null";
        }
        String leftTree = serializeToString(node.left);

        String rightTree = serializeToString(node.right);

        /*
            This is using InOrder Traversal to capture the tree
            the problem with InOrder traversal is that  the position of root is ambigous ,
            hence re-creating tree is difficult
            instead use Pre-Order or Post-Order traversal

                Also remember Inorder traversal is genrally complemented with postorder or inorder traversal to reconstruct tree .
         */
//        return leftTree+","+node.val+","+rightTree;

        return node.val+","+leftTree+rightTree;

    }

    public TreeNode deserialize(String data) {

        String[] values = data.split(",");

        int[] index = new int[1];

        return build(values, index);
    }

    /*
        Here we have nulls in PreOrder sequence , hence can build unique trees .
        but in problems where null might not be present pre-order won't be able to tell you the boundaries

        pre-order used to find next root node + inorder to find boundaries = tree creation
     */
    public TreeNode build(String[] values, int[] index){

        String current = values[index[0]];

        index[0]++;

        if(current.equals("null")){
            return null;
        }

        TreeNode node =
                new TreeNode(Integer.parseInt(current));

        node.left = build(values, index);
        node.right = build(values, index);

        return node;
    }
}