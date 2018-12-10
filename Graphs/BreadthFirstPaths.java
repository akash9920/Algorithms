public class BreadthFirstPaths{
    //In any connected graph G, BFS computes shortest paths
    //from s to all other vertices in time proportional to E + V


 private boolean[] marked;
 private int[] edgeTo;
 private int[] distTo;
 
 private void bfs(Graph G, int s) {
 Queue<Integer> q = new Queue<Integer>();
 // enqueue means adding items to the queue
 q.enqueue(s);
 marked[s] = true;
 distTo[s] = 0;
 while (!q.isEmpty()) {
 int v = q.dequeue();
 for (int w : G.adj(v)) {
 if (!marked[w]) {
 q.enqueue(w);
 marked[w] = true;
 edgeTo[w] = v;
 distTo[w] = distTo[v] + 1;

 }
 }
 }
 }
}