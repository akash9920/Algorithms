import java.util.HashMap;

class StairCase {

/*
There are n stairs, a person standing at the bottom wants to reach the top.
 The person can climb either 1 stair or 2 stairs at a time.
 Count the number of ways, the person can reach the top.
*/


public static void main(String[] args){

StairCase S = new StairCase();

System.out.print(" the number of ways is  : " + S.climbStairs(20));

}

HashMap<Integer,Integer> memory = new HashMap<>();
    
public int climbStairs(int n) {
        
    return utilityStairsClimb(n,memory);
    
}




public int utilityStairsClimb(int remain,HashMap<Integer,Integer> memory ){
    
    int val;
    
    if (remain==0) return 1;
    if(remain<0) return 0;
    if(memory.containsKey(remain)) return memory.get(remain);
    
    val =  utilityStairsClimb(remain-1,memory) + utilityStairsClimb(remain-2,memory);
    memory.put(remain, val);
    
    return val;
    
    
}

}