class MaxProfitMultiple {

public static void main(String[] args){

    int[] arr = {7,1,5,3,6,4};
    MaxProfitMultiple max = new MaxProfitMultiple();

    System.out.println(max.maxProfitPeakAndValley(arr));

}


// try to solve this question by peak and valley approach

public int maxProfitPeakAndValley(int[] prices){

   
        
        // int maxProfit = Integer.MIN_VALUE;
             int maxProfit = 0 ;
             
             // if purchase = true it means it should purchase else he should sell
             
          //   Boolean canPurchase = true;
         
             for(int i=0;i<prices.length-1;i++){
                 
                int j=i+1;
                 if(shouldBuy(prices,i,j)){
                     
                     //canPurchase = false;
                     
                     maxProfit = maxProfit + prices[j]-prices[i];
                    
                     i=i+1;
                     
                 }        
             }
             
              return maxProfit;
         
         
}
    



    
public int maxProfit(int[] prices) {
        
    // int maxProfit = Integer.MIN_VALUE;
         int maxProfit = 0 ;
         
         // if purchase = true it means it should purchase else he should sell
         
         Boolean canPurchase = true;
     
         for(int i=0;i<prices.length-1;i++){
             
            int j=i+1;
             if(canPurchase && shouldBuy(prices,i,j)){
                 
                 canPurchase = false;
                 
                 maxProfit = maxProfit + prices[j]-prices[i];
                 i++;
             }
             
             if(!canPurchase && shouldSell(prices,i,j)){
                 
                 canPurchase = true;
                 i++;
                 
                 maxProfit = maxProfit + prices[i]-prices[j];
             }
             
             
         }
         
          return maxProfit;
         
         
         
     
     }
     
     
     
     
     public Boolean shouldBuy(int[] arr , int i , int j){
         
         if(arr[j]>arr[i]) return true;
         else return false;
         
     }
     
     public Boolean shouldSell(int[] arr, int i , int j){
         
         if(arr[i]>arr[j]) return true;
         else return false;
     }

}