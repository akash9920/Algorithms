class FibonacciSeries {


    public static void main(String args[] ){


            int i = fin(n);

            System.out.println(" the value of the fib is " + i);


    }



    public int fib(int n){


        if(n<=1){
            return 1;
        }

        return fib(n-1) + fib(n-2);


    }





}