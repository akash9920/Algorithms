import java.util.HashMap;
import java.util.Map;

class FibonacciSeries {

  static   Map<Integer,Integer> fibMap  = new HashMap<>();

    public static void main(String args[] ){

            int n = 10;

           // FibonacciSeries f = new FibonacciSeries();
            int i = fib(n);

            System.out.println(" the value of the fib is " + i);

    }


public static int fib(int n){

   
    return startfib(n);
}


    public static int startfib(int n){

        
        if(n<=1){
            return 1;
        }

        if(fibMap.containsKey(n)){

            return fibMap.get(n);
        }

        int value = fib(n-1) + fib(n-2);
        fibMap.put(n, value);
        return value;
    }





}