public class Graph
{
 private final int V;
 private Bag<Integer>[] adj;
 
 public Graph(int V)
 {
 this.V = V;
 //unable to understand the following line of syntax
// soln: its like a simple declaration, arr = new int[size];

 adj = (Bag<Integer>[]) new Bag[V];
 // is it necessary to intialize with bag object as we have given an intial declaration
 
 for (int v = 0; v < V; v++)
 adj[v] = new Bag<Integer>();
 }

 public void addEdge(int v, int w)
 {
 adj[v].add(w);
 adj[w].add(v);
 }
 
 public Iterable<Integer> adj(int v)
    {
        return adj[v]; 
    }


}