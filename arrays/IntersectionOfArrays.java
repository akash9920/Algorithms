class IntersectionOfArrays{


    public static void main(String[] args){

    }

    public int[] intersect(int[] nums1, int[] nums2) {
     
        List<Integer> intersectionList = new ArrayList<>();
        
        int i=0;
        int j=0;
        
         while(i<nums1.length && j<nums2.length){
             
             if(nums1[i]==nums2[j]){
                 
                 intersectionList.add(nums[i]);
                 
                 i++;
                 j++;
                 
             }
             
             else if(nums1[i]<nums2[j]){
                 i++;
             }
             
             else {
                 j++;
             }
         }
        
        return Arrays.asList(intersectionList);
        
        
    }
    
}