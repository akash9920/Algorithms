class DetectCycle {

/* 
     
    its a leetcode question number 234
    
    @author 
    Akash Anand
    */


    //with O(n) memory usage, easy but not effecient solution
    public boolean hasCycle(ListNode head) {
        
        HashMap<ListNode,Boolean> hasVisitedMap = new HashMap<>();
        
        
        // we can use  ArrayList as well but that will slow down the run time. as per the run status
        // on leetcode HashMap gives 5ms,ArrayList took 43ms
      //  List<ListNode> hasVisitedMap = new ArrayList<>(); 
        ListNode temp = head;
   
        while(temp!=null){
                    if(hasVisitedMap.containsKey(temp)) return true;
        
        else {
            
            hasVisitedMap.put(temp,true);
            temp = temp.next;
        }
        }
        
        return false;

        
    }


    public boolean hasCycle2(ListNode head) {
        
    }


    /**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */

 


}