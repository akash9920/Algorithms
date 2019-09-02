/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
class Solution {
    
    public List<Integer> preorderTraversal(TreeNode root) {
    
        List<Integer> preOrder = new LinkedList<Integer>();
        
        utilityPreOrder(root,preOrder);
        
        return preOrder;
        
    }
    
    
    public void utilityPreOrder(TreeNode root, List<Integer> preOrder){
        
                if(root==null) return;
        
                preOrder.add(root.val);
                utilityPreOrder(root.left);
        
                utilitdyPreOrder(root.right); 
    }
}