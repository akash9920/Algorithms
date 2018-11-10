public class LowestCommonAncestor {



    public Node findLowestCommonAncestor(Node root, Node x, Node y){

        if(root == x || root == y) return root;
        if(root == null) return null;

        Node left = findLowestCommonAncestor(root.left, x, y);
        Node right = findLowestCommonAncestor(root.right, x, y);

    }


}