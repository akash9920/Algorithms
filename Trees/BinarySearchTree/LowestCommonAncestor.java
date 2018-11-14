class LowestCommonAncestor {


    public static void main(String[] args){

    }

// my original method

/*
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
     
            
        if(root.val>p.val && root.val<q.val || root.val>q.val && root.val<p.val ) return root;
        
        if(root.val<p.val && root.val<q.val) return lowestCommonAncestor(root.right,p,q);
        
        else if (root.val>p.val && root.val>q.val) return lowestCommonAncestor(root.left,p,q);
        
        else return null;
        
    }

*/



    public Node findLCA(Node root, Node left,Node right){

        if(root.data.compareTo(left.data)>0 &&root.data.compareTo(right.data)<0 ) return root;

        if(root.left.data.compareTo(left.data)>0) {
`
            return findLCA(root.left, left, right);
        }
        else if(root.right.data.compareTo(left.data)<0) {
            
            return findLCA(root.right, left, right);
        }

        else {
            return null;
        }


    }



}