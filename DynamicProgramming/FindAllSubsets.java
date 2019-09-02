import java.util.HashSet;

class FindAllSubsets {

static HashSet<HashSet<Integer>> allSubSet = new HashSet<>();

public static void main(String[] args) {
    
    FindAllSubsets f = new FindAllSubsets();
    int[] arr = {6,5,31,8};

    f.findSubsets(arr);
    f.printSubSet(allSubSet);

}



public void findSubsets(int[] arr){

    for(int i=0;i<arr.length;i++){
        

     for(int j=0;j<arr.length;j++){

        HashSet<Integer> subSet = new HashSet<>();

        for(int k=i;k<=j;k++){
            subSet.add(arr[k]);
        }
        allSubSet.add(subSet);
     }
     

    }
}

public void printSubSet(HashSet<HashSet<Integer>> set){

    for(HashSet<Integer> h : set){

        System.out.print("{ ");
        for(Integer i : h){
            System.out.print(i  + ",");
         
        }
        System.out.println(" }");
        System.out.println();
    }
}

}