
 class InsertionSort{




    public static void main(String[] args){


    }


    public void sort(X[] xs, int from, int to) {

        int L = xs.lenght;
        int key;
        int temp;
        int j;
        for (int i=1; i<L; ++i) 
        { 
             key = xs[i]; 
             j = i-1; 
            while (j>=0 && xs[j] > key) 
            { 
                xs[j+1] = xs[j]; 
                j = j-1; 
            } 
            xs[j+1] = key; 
        } 
    }
 }
