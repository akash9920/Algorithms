public class DepthFirstPaths
{
 private boolean[] marked;

 // since it is a depth first search, we wont be fiding all the path  from a vertext
//as  we will just go through  the path only once
// by using a dfs we can find a path from s ---- > to v

// edgeto tells the previous vertex from the current one

 private int[] edgeTo;
 private int s;
 public DepthFirstPaths(Graph G, int s)
 {
 dfs(G, s);
 }

 // in this we are tracing backward, we need to find the 
 // the path from the vertex s to v and now we are tracing back our path
 // thats why edgeTo function in dfs corresponds to the previous vertex to the current travsering vertex
 
 private void dfs(Graph G, int v)
 {
 marked[v] = true;
 for (int w : G.adj(v))
 if (!marked[w])
 {
     // didnt get that ??
// we are 
 dfs(G, w);
 edgeTo[w] = v;
 }
 }

 public boolean hasPathTo(int v)
 { return marked[v]; }

 // it is giving the path with the help of the stack
 // 

 public Iterable<Integer> pathTo(int v)
 {
 if (!hasPathTo(v)) return null;
 Stack<Integer> path = new Stack<Integer>();
 for (int x = v; x != s; x = edgeTo[x])
 // this for loop keep on looking for the next edge to the
 // current edge and provided that it should bit be equal to s
// the question is how this loop gonna end, that is  very important
    path.push(x);
 path.push(s);
 return path;
 }

}

// questions ??, how
// After DFS, can check if vertex v is connected to s in
//constant time

