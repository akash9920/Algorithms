class RotateArray{

    public static void main(String[] args){
int[] arr = {1,2,3,4,5,6,7};


for(int i : arr){
    System.out.print(" " +i);
}

System.out.println(" ");

RotateArray r = new RotateArray();

    r.rotate(arr, 3);

    for(int i : arr){
        System.out.print(" " +i);
    }
    }

    public void rotate(int[] nums, int k) {
        
        
        if(k>nums.length) k = k%nums.length;
        int[] temp = new int[k];
        
        int i=0;
        int j=nums.length-k;
        
        while(i<k){
            temp[i++] = nums[j++];
            
        }
        
        j=nums.length-1;
        i=nums.length-k-1;
        
        while(i>=0){
        
            nums[j] = nums[i];
            j--;
            i--;
  
        }
        
        i=0;
        while(i<k){
            nums[i]=temp[i];
            i++;
        } 
    }
}