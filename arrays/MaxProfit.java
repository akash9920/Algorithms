class MaxProfit{

    public static void main(String[] args){

        int[] arr = {7,1,5,3,6,4};

        MaxProfit a = new MaxProfit();

        System.out.println(a.maxProfit(arr));

    }

    // optimum solution

    public int maxProfit2(int[] prices) {
    
        int minVal = Integer.MAX_VALUE;
        int maxProfit=0;
        
        for(int i=0;i<prices.length;i++){
            
            if(prices[i]<minVal){
                minVal = prices[i];
            }
            
            else if(prices[i]-minVal>maxProfit){
                maxProfit = prices[i]-minVal;
            }
        }
        return maxProfit;
    }


    // brute force 253 ms runtime, not so good
    public int maxProfit(int[] prices) {
        
        int max=0;
  
        int diff=0;

    for(int i=1;i<prices.length;i++){
        
        for(int j=i-1;j>=0;j--){
            diff = prices[i]-prices[j];
            
            if(diff>max) max = diff;
            
        }
    }
        
        return max;
    }
}