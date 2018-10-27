
class ArrayLengthSum{
    /*
    Question statement: 

    Implement a function that takes in an array of non-negative numbers and an integer.
    You want to return the *LENGTH* of the shortest subarray whose sum is at least the integer, and -1 if no such sum exists.
    
     */
    public static void main(String[] args){

        int[] arr = {1,2,3,4,5,6,7,8,9};
        ArrayLengthSum S = new ArrayLengthSum();

        System.out.println(S.subArraySumLength(arr, 10));
}



    public int subArraySumLength(int[] arr, int target){

        // brute force
       // int sum=0;

        int L = arr.length;

        for(int i=0;i<L-1;i++){
            int sum=arr[i];
            for(int j=i+1;j<L;j++){
                sum = sum +arr[j];
                if(sum>target) break;
                else if(sum==target) return j-i+1;
            }
        }
        return -1;

    }

}
