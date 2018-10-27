

class AmazonDelivery {

	/*
	 * 2. Amazon Delivery problem - starting from origin Matrix - 2D Allowed road -
	 * 1 Not allowed road - 0 Destination - 9 Find any valid Path to reach the
	 * destination; but you don't know where 9 is! You've to search that as well.
	 * 
	 */

     static int counter=0;

	public static void main(String[] args) {

        int[][] map = {   { 1, 1, 0, 0, 0, 0, 0, 0, 0 }, 
                          { 0, 1, 0, 0, 0, 0, 0, 0, 0 },
                          { 0, 1, 1, 1, 0, 0, 0, 0, 0 },
                          { 0, 0, 1, 1, 0, 0, 0, 0, 0 },
                          { 0, 0, 1, 0, 0, 0, 0, 0, 0 },
                          { 0, 0, 1, 1, 1, 1, 1, 1, 0 },
                          { 0, 0, 0, 0, 0, 0, 0, 1, 9 } 
                        };

                       
        AmazonDelivery Amazon = new AmazonDelivery();
        
        Amazon.printSolution(map);
		System.out.print(Amazon.findDelivery(map));

    }
    
    public void printSolution(int sol[][]) 

    {
        int col = sol[0].length;
        int row = sol.length; 
        for (int i = 0; i < row; i++) 
        { 
            for (int j = 0; j < col; j++) 
                System.out.print(" " + sol[i][j] + 
                                 " "); 
            System.out.println(); 
        } 
    } 

	public boolean findDelivery(int[][] DeliveryMap) {

        int[][] temp = new int[DeliveryMap.length][DeliveryMap[0].length];
        
        if(deliveryUtil(DeliveryMap, temp, 0, 0)==false){

            printSolution(temp);

            System.out.println(" Solution Doest not exist");
            return false;
        }
        else{
            printSolution(temp);
            return true;
        } 

	}

	public boolean isSafe(int[][] DeliveryMap, int x_row, int y_column) {

		int row = DeliveryMap.length;
		int col = DeliveryMap[0].length;

		return (x_row>=0&&x_row < row &&y_column>=0&& y_column < col && DeliveryMap[x_row][y_column] == 1);

	}

	public boolean deliveryUtil(int[][] DeliveryMap, int[][] temp, int x_row, int y_column) {

        
        if (DeliveryMap[x_row][y_column] == 9) {

            temp[x_row][y_column] = 9;
            return true;
        }

		if (isSafe(DeliveryMap, x_row, y_column)) {


            temp[x_row][y_column] = 1;
            
            System.out.println("==========="+ " "+  counter++ +" "+"=====================");

            printSolution(temp);

            System.out.println("================================");

			if (deliveryUtil(DeliveryMap, temp, x_row + 1, y_column))
				return true;

			if (deliveryUtil(DeliveryMap, temp, x_row, y_column + 1))
				return true;

			temp[x_row][y_column] = 0;

			return false;

		}
		return false;

	}

}