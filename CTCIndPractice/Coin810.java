class Coin810{

    public int penny(int n) {
		
		HashMap<Integer,Integer> pennyMapMemory = new HashMap<>();
		
		return utility(n, pennyMapMemory);
	}
	
	
	public int utility(int n , HashMap<Integer,Integer> memory) {
		
		if(n<0) {return 0;}
		if(n==0) {return 1;}
		
		
		if(memory.containsKey(n)) {return memory.get(n);}
		
		int val = utility(n-25,memory) + utility(n-10,memory)+utility(n-5,memory)+utility(n-1,memory);
		
		memory.put(n, val);
		return val;
	}
    
}