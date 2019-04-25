class ReverseInteger{



    public int reverse(int x) {
        
        if(x>Integer.MAX_VALUE || x<Integer.MIN_VALUE) return 0;
        int temp=x;
        int reverse=0;
        boolean isNegative=false;
        
        if(temp<0) isNegative=true;
        
        if(isNegative) temp=temp*(-1);
        
        while(temp!=0){
            
            reverse = reverse*10 + temp%10;
            
            temp =temp/10;
        }
        
        if(reverse>Integer.MAX_VALUE || reverse<Integer.MIN_VALUE) return 0;
        else  if(isNegative) return reverse*(-1);
        else return reverse;     
        
    }

}