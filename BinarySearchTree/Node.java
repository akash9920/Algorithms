class Node  {

    private Comparable data;
    private Node left;
    private Node right;


    public Node(Comparable NodeValue){

        this.data = NodeValue;
        this.left = null;
        this.right = null;
    }



    public void getNodeData(Comparable node){

        return node.data;
    }


}