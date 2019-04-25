class RemoveElement {

    // Given an array nums and a value val, remove all instances of that value in-place and return the new length.

    // Do not allocate extra space for another array, you must do this by modifying the input array in-place with O(1) extra memory.
    
    // The order of elements can be changed. It doesn't matter what you leave beyond the new length.


    public int removeElement(int[] nums, int val) {
        
        
        int i=0;
        int j=0;
        while(j<nums.length){
            
            if(nums[j]== val){
                
                j++;
            }
            else {
                nums[i]=nums[j];
                i++;
                j++;
            }
        }
        
        return i;
    }
}