import java.util.HashMap;

public class CTCIndPract {



    public static void main (String[] args){

        // Fibonacci series
        CTCIndPract s = new CTCIndPract();
        int n = 10;

        System.out.println(" test");
        System.out.println(" fib : "  + n +" " + s.fib(n) );

    }


    


    public int fib(int n){

        
    HashMap<Integer,Integer> fibMapMemory = new HashMap<>();

    return utilFib(n,fibMapMemory);
    }

    public int utilFib(int n , HashMap<Integer,Integer> fibMapMemory){

        if(n<0) return 0;
        if(n==1) return 1;

        if(fibMapMemory.contains(n)) {return fibMapMemory.get(n);}
        
        int k = utilFib(n-1,fibMapMemory) + utilFib(n-2,fibMapMemory);
        fibMapMemory.put(n,k);
        
        return k;

    }





}