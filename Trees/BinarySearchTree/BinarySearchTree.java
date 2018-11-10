import BinarySearchTree.Node;


class BinarySearchTree{

    Node mainroot;



    public void addNode(Comparable data){

        Node temp = mainroot;

        addNodeUtil(Data, temp);

    }




    public void addNodeUtil(Comparable Data ,Node root) {

		if (root == null) {
            root = new Node( data);
           // return;
		}

		Queue<Node> BFS = new LinkedList<>();

		BFS.add(root);


	}





    public void addNodetemp(Comparable data){
        
                if(root==null){

                    root = new Node(data);
                    return;
                }

        if((getNodeData(root)).Compareto(data)<0){

                root = root.left;
            
        }

    }


}