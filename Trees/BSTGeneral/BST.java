public class BST<Key extends Comparable<Key>, Value> {

    // its a generalization like <key,value>;
    
    private Node root; // root of BST

    // Private Node Class
    private class Node {
        private Key key; // sorted by key
        private Value val; // associated data
        private Node left, right; // left and right subtrees
        private int count;
       
        public Node(Key key, Value val) {
            this.key = key;
            this.val = val;

        }
    }

    /**
     * Initializes an empty symbol table.
     */
    public BST() {
    }

    public Value get(Key key) {
        Node x = root;
        while (x != null) {
            int cmp = key.compareTo(x.key);
            if (cmp < 0)
                x = x.left;
            else if (cmp > 0)
                x = x.right;
            else if (cmp == 0)
                return x.val;
        }
        return null;
    }

    public void put(Key key, Value val) {
        root = put(root, key, val);
    }

    private Node put(Node x, Key key, Value val) {
        if (x == null)
            return new Node(key, val);
        int cmp = key.compareTo(x.key);
        if (cmp < 0)
            x.left = put(x.left, key, val);
        else if (cmp > 0)
            x.right = put(x.right, key, val);
        else if (cmp == 0)
            x.val = val;
        return x;
    }

    public void deleteMin() {
        root = deleteMin(root);
    }

    // unable to understand this one properly??

    private Node deleteMin(Node x) {
        if (x.left == null)
            return x.right;
        x.left = deleteMin(x.left);
        x.count = 1 + size(x.left) + size(x.right);
        return x;
    }

}