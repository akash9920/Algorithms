public class DepthofTree{


    public int treeDepth(Node root){

        if (root== null) return null;

        int left = treeDepth(root.left);
        
        int right = treeDepth(root.right);

        // return left>right? left+1 : right+1;
        return Math.max(left, right) +1;

    }
}