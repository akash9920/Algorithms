
class ArrayLengthSum{
    /*
    Question statement: 

    Implement a function that takes in an array of non-negative numbers and an integer.
    You want to return the *LENGTH* of the shortest subarray whose sum is at least the integer, and -1 if no such sum exists.
    
     */

    public static void main(String[] args){

        int[] arr = {1,2,3,4,5,5,6,7,8,9};
               

       
        ArrayLengthSum S = new ArrayLengthSum();

       // System.out.println(S.binarySearch(arr, 9));
        System.out.println(S.subArraySumLength(arr, 9));
}





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


    




    public int subArraySumLength(int[] arr, int target){

        // brute force
       // int sum=0;
       int minLength=Integer.MAX_VALUE;
        int temp=0;
        int L = arr.length;
        // Lil optimization
        // BinarySearch for single element, 
        // though the process needs to be improved further

     

        if(arr[binarySearch(arr, target)]== target){ return 1;}


        for(int i=0;i<L-1;i++){
            int sum=arr[i];
            for(int j=i+1;j<L;j++){
                sum = sum +arr[j];
                if(sum>target) break;
                
                else if(sum==target) {
                    temp = j-i+1;
                    if(temp<minLength){
                        minLength = temp;
                     }   
                }

                
            }
        }
        if(minLength!= Integer.MAX_VALUE){

            return minLength;
        }

        return 0;

    }



}
