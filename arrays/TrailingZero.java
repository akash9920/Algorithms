class TrailingZero{

    public static void main(String[] args){

        TrailingZero t = new TrailingZero();

    System.out.println(t.trailingZeroes(1808548329));

    }

    public int trailingZeroes(int n) {
    
        int i = n;
        int countFive=0;
        int countZero =0;
        while(n>0){
            
            i=n;
            while(i>0){
                
                while(i%10==0 && i>0){
                    
                   countZero++; 
                  i=i/10;  
                }
                

                while(i%5==0 && i>0){
                    
                    countFive++;
                    i=i/5;
                }
                
                i=0;
                
            }
            
            n--;
        }
          
            return countZero + countFive;
        

        
    }
}