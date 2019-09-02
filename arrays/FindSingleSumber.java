import java.util.HashSet;

class FindSingleNumber {


    /*
    Given a non-empty array of integers, every element appears twice except for one. Find that single one.

Note:

Your algorithm should have a linear runtime complexity. Could you implement it without using extra memory?

Example 1:

Input: [2,2,1]
Output: 1

leetcode 136
    */

public static void main(String[] args){

    FindSingleNumber f = new FindSingleNumber();

    int[] arr = {};



}

// Xor operation approach
public int singleNumber1(int[] nums) {
    
    int xorNum=0;
    
    for(int i=0;i<nums.length;i++){
        
        xorNum =  xorNum^nums[i];
        
    }
    
    return xorNum;
    
}

// there are two aproches, (Using hash tabletime O(n), space O(1) ) and bit manupulation(time O(n), space O(1))

public int singleNumber(int[] nums) {
     
    HashSet<Integer> isPresent = new HashSet<>();
    
    int singleNum =-1;
    for(int i=0;i<nums.length;i++){
        
        if(!isPresent.contains(nums[i])){
            
            isPresent.add(nums[i]);
            
        
        }
        
        else if(isPresent.contains(nums[i])){
            
            isPresent.remove(nums[i]);
        }
    }
    
    for(Integer ak : isPresent){
     
        return ak;
    }
    
    return singleNum;
    
    
}




}