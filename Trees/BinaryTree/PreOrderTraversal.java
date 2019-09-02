class PreOrder{

    
        public List<Integer> preorderTraversal(TreeNode root) {
        
            List<Integer> preOrder = new LinkedList<Integer>();
            
            utilityPreOrder(root,preOrder);
            
            return preOrder;
            
        }
        
        
        public  void utilityPreOrder(TreeNode root, List<Integer> preOrder){
            
                    if(root==null) return;
            
                    preOrder.add(root.val);
                    utilityPreOrder(root.left);
            
                    utilityPreOrder(root.right); 
        }
    
}