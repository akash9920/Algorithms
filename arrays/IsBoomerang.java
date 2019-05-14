class IsBoomerang{

    public static void main(String[] args){

        IsBoomerang s = new IsBoomerang();
        int arr[][] = {{0,1},{2,1},{0,0}};
       // int arr[][] = {{1,1},{1,2},{0,0}};

System.out.println(s.isBoomerang(arr));


    }

    public boolean isBoomerang(int[][] points) {
    
        
        if(!isUniquePoints(points[0],points[1]) || !isUniquePoints(points[1],points[2])) return false;
        
        float y = slope(points[0],points[1]);
        float x = slope(points[1],points[2]);
        return  x == y ? false:true;
        
    }
    
    
    
    public float slope(int[] x, int[] y){
        
        // returning max value for Y axis;
        if(x[0]-y[0]==0) return Integer.MAX_VALUE; 
        
        float slope =  (float)((float)(x[1]-y[1])/(float)(x[0]-y[0]));
        return slope;
    }
    
    public boolean isUniquePoints(int[] x, int[] y){
        
        
        if(x[0]==y[0] && x[1]==y[1]) return false;
        
        return true;
    }
}