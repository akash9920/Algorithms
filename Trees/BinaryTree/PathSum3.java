/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */

class PathSum3 {
    
    List<List<Integer>> paths = new ArrayList<>();
    
    List<Integer> pathSumList = new ArrayList<Integer>();
    
    
    
    public List<List<Integer>> pathSum(TreeNode root, int sum) {
        
        checkPathSum(root,0,sum);
        return paths;
        
    }
    
    public void checkPathSum(TreeNode root,int currentSum, int target){
        
        if(root==null){
            return;
        }


        currentSum= currentSum + root.val;
        pathSumList.add(root.val);
        
        if(root.left==null && root.right==null){
            
            System.out.println(" l n r = null");
            if(currentSum==target){
                System.out.println("currentsum== target");
                paths.add(pathSumList);
               // pathSumList.remove(pathSumList.size()-1);
            }
            pathSumList.remove(pathSumList.size()-1);
            
            
        }
        checkPathSum(root.left,currentSum,target);
        checkPathSum(root.right,currentSum,target);
      
        
    }
    
    
}