class NoOfIslands {
    
public static void main(String[] args){

    char[][] arr = {{'1','1','1','1','0'},{'1','1','0','1','0'},{'1','1','0','0','0'},{'0','0','0','0','0'}};

    NoOfIslands f = new NoOfIslands();

    System.out.println(f.numIslands(arr));
}

    char[][] gridS;
    
    int[] islandLoc = new int[2];
    
    int noOfIslands=0;
    
    int row = 0;
    int col = 0;
    
    
    public int numIslands(char[][] grid) {
        
         row = grid.length;
         col = grid[0].length;
        
         gridS = grid;
        System.out.println("row " + row + " col "  + col);
        while(islandLoc[0] != -1 || islandLoc[1] != -1){
        
            islandLoc = scan(gridS); 

            System.out.println(islandLoc[0] +  " " +islandLoc[1]);
               searchIsland(gridS,islandLoc[0],islandLoc[1]);
                
                noOfIslands++;
        }
        
        return noOfIslands;
        
        
     
    }
    
    
    public void searchIsland(char[][] grid, int x, int y){
        System.out.println("x:"  + x + " y: " + y + " col: " + col + " row :" + row );
        if(x>=row || y>= col){
            return;
        }
        
        if(x<row && y < col){
            
            if (grid[x][y] == '0'){
            return;
        }
        
        
        if(grid[x][y]== '1'){
            
            grid[x][y]= '0' ;
            searchIsland(grid,x+1,y);
            searchIsland(grid,x,y+1);
            
        }
        }       
    }
    
    
    
    public int[] scan(char[][] arr){
           
        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                
                if(arr[i][j] == '1'){
                    islandLoc[0]= i;
                    islandLoc[1] = j;
                    
                    return islandLoc; 
                }
            }
        }
        
        islandLoc[0]= -1;
        islandLoc[1] = -1;
        
        return islandLoc; 
        
    }
}