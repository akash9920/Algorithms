public class BinarySearch{
    

    public int binarySearch(int[] arr,int target){

        int lo=0;
        int hi=arr.length-1;
       return binaryUtil(arr, lo, hi, target);
    
    }
    
    public int binaryUtil(int[] arr, int lo, int hi,int key){
    
        int mid  = lo + (hi-lo)/2;
    
    
        if(hi>=lo){
    
            if(arr[mid] == key ){return mid;}
            else if(arr[mid]>key){return binaryUtil(arr, lo, mid-1, key);}
            else {return binaryUtil(arr, mid+1, hi, key);}
        }   
    
        return -1;
    
    
    
    }
    

}