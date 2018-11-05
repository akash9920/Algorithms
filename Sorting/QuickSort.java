class QuickSort {






    
    private static void sort(Comparable[] a, int lo, int hi) { 
        if (hi <= lo) return;
        int j = partition(a, lo, hi);
        sort(a, lo, j-1);
        sort(a, j+1, hi);
           }

    private static int partition(Comparable[] a, int lo, int hi) {
            int i = lo;
            int j = hi + 1;
            Comparable v = a[lo];
            while (true) { 
    
                // find item on lo to swap
                while (less(a[++i], v)) {
                    if (i == hi) break;
                }
    
                // find item on hi to swap
                while (less(v, a[--j])) {
                    if (j == lo) break;      // redundant since a[lo] acts as sentinel
                }
    
                // check if pointers cross
                if (i >= j) break;
    
                exch(a, i, j);
            }
    
            // put partitioning item v at a[j]
            exch(a, lo, j);
    
            // now, a[lo .. j-1] <= a[j] <= a[j+1 .. hi]
            return j;
        }

        public static Comparable select(Comparable[] a, int k) {
            if (k < 0 || k >= a.length) {
                throw new IllegalArgumentException("index is not between 0 and " + a.length + ": " + k);
            }
            StdRandom.shuffle(a);
            int lo = 0, hi = a.length - 1;
            while (hi > lo) {
                int i = partition(a, lo, hi);
                if      (i > k) hi = i - 1;
                else if (i < k) lo = i + 1;
                else return a[i];
            }
            return a[lo];
        }
        
    
}
