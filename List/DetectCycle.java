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
        
        
        if(head.next== null || head.next.next == null ) return false;
        
        ListNode x = head.next;
        
        ListNode x2 = head.next.next;
            
            while(x!= null && x2!=null){
                
                if(x==x2) return true;
                
                x= x.next;
                x2 = x2.next.next;
            }
        
        return false;
        
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