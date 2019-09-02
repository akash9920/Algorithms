


// public class Solution {

//     public static void main(String[] args){

//         // need methpods to create a linkedList

//         // the following is the solution to the leetcode problem number 160
//     }
    
//     public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
     
//         int lengthA=0;
//         int lengthB=0;
//         int diff=0;
        
//         ListNode tempA = headA;
//         ListNode tempB = headB;
        
//         while(tempA!=null){
//             lengthA++;
//             tempA = tempA.next;
//         } 
        
//         while(tempB!=null){
//           lengthB++;  
//              tempB = tempB.next;
//         } 
        
//         if(lengthA>lengthB){
//             diff = lengthA-lengthB;
//             tempA = headA;
//             tempB= headB;
            
//             while(diff!=0){
//                 tempA = tempA.next;
//                 diff--;
//             }
//         }
        
//         else {
//              diff = lengthB-lengthA;
//             tempA= headA;
//             tempB = headB;
            
//             while(diff!=0){
//                 tempB = tempB.next;
//                 diff--;
//             }
              
//         }
        
//         while(tempA!=null){
         
//            if (tempB == tempA) return tempA;
            
//             tempA = tempA.next;
//             tempB = tempB.next;
            
//         }
        
//         return null;  
//     }



    
//   private class ListNode {
//     int val;
//     ListNode next;
//     ListNode(int x) {
//         val = x;
//         next = null;
//     }
// }
// }