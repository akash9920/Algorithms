
 class MergeSortStatic{




    public static void main(String[] args){

        Comparable[] arr = {4,5,6,7,3,4,2,1,9,8};

      //  MergeSort I = new MergeSort();

       mergeSortStart(arr);

        for(Comparable i : arr){
            System.out.print(" " + i);
        }


    }

public static void mergeSortStart(Comparable[] arr){

    Comparable[] aux = new Comparable[arr.length]; 

    int lo = 0;
    int hi = arr.length-1;

    sort(arr, aux, lo, hi);
}

public static  void sort(Comparable[] arr, Comparable[] aux, int lo,int hi){

    if(hi<=lo) return;
    
    int mid = lo + (hi-lo)/2;

        sort(arr, aux, lo, mid);
        sort(arr, aux, mid+1, hi);
        merge(arr,aux,lo,hi,mid);

}


public static void merge(Comparable[] arr, Comparable[] aux, int lo, int hi, int mid){

    int i=lo; // starting point of left subarray
    int j=mid+1; // starting point of right subarray
    int k=lo;

    for( k=lo;k<=hi;k++){
        aux[k] = arr[k];
    }


    for(k=lo;k<=hi;k++) {
			
        if(i>mid)   					  		 arr[k]=aux[j++];
        else if(j>hi)   						 arr[k]=aux[i++];
        else if(aux[j].compareTo(aux[i])<0)      arr[k]=aux[j++];
        else									 arr[k]=aux[i++];	
    }

    // error to be seen later
    
//     while(k<=hi && k>=lo ){
// System.out.println(" i    :" + i + "      j   :" +j + "      k "+ k);
//         if(i>mid)                                arr[k++]=  aux[j++];
//         else if(j>hi)                            arr[k++] = aux[i++];
//         else if ((aux[i].compareTo(aux[j])) <0)  arr[k++] = aux[j++];
//         else                                     arr[k++] = aux[i++];

//    }


}




 }
