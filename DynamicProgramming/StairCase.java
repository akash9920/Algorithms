import java.util.HashMap;

class StairCase {

/*
There are n stairs, a person standing at the bottom wants to reach the top.
 The person can climb either 1 stair or 2 stairs at a time.
 Count the number of ways, the person can reach the top.
*/


public static void main(String[] args){

StairCase S = new StairCase();

System.out.print(" the number of ways is  : " + S.stairCase(20));

}

HashMap<Integer,Integer> Hashmemory = new HashMap<>();

public int stairCase(int n){

    int memory = n;

    return stairUtility(memory, n);
}


public int stairUtility(int memory,int totalsteps){

if (memory<0) return 0;    
if (memory==0) return 1;

if(Hashmemory.containsKey(memory)) return Hashmemory.get(memory);


Integer computeSteps = stairUtility( memory-1, totalsteps)+ stairUtility(memory-2,totalsteps);

Hashmemory.put(memory, computeSteps);

return computeSteps;
}

}