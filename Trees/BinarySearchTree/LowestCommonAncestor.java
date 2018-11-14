class LowestCommonAncestor {


    public static void main(String[] args){

    }



    public Node findLCA(Node root, Node left,Node right){

        if(root.data.compareTo(left)>0 &&root.data.compareTo(right)<0 ) return root;

        Node leftNode = findLCA(root.left, left, right);
        Node rightNode = findLCA(root.right, left, right);
    }



}