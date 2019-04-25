class MergeSortedArray{


    /*
       * Given two sorted integer arrays nums1 and nums2, merge nums2 into nums1 as one sorted array.

        *Note:

        The number of elements initialized in nums1 and nums2 are m and n respectively.
        You may assume that nums1 has enough space (size that is greater or equal to m + n) to hold additional elements from nums2.
        Example:

        Input:
        nums1 = [1,2,3,0,0,0], m = 3
        nums2 = [2,5,6],       n = 3

        Output: [1,2,2,3,5,6]

    */


public static void main(String[] args){

   int[] arr1 =  {1,2,3,0,0,0};
    int m=3;
int[] arr2  = {2,5,6};
int n = 3;
MergeSortedArray s = new MergeSortedArray();

s.merge(arr1, m, arr2, n);
}


public void merge(int[] nums1, int m, int[] nums2, int n) {
    int l = nums1.length;
    int i = m-1;
    int j = l-1;
    int k = 0;

    if (n <= 0)
        return;

    while (i >=0 && j >= l - m) {
        nums1[j] = nums1[i];
        j--;
        i--;

    }
    i = 0;
    j = 0;
    k = l - m;

    while (i < l && j < n) {


        if (k < l && nums1[k] < nums2[j]) {

            nums1[i] = nums1[k];
            k++;
            i++;
        } else if (k < l && nums1[k] > nums2[j]) {

            nums1[i] = nums2[j];
            i++;
            j++;

        }

        else {
            if (j < n) {
                nums1[i++] = nums2[j++];
            }
            if (k < l) {
                nums1[i++] = nums1[k++];
            }

        }

    }
}




}