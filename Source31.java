// Check if an Undirected Graph is a Tree or Not
// Description
// Given a graph with N vertices. Check whether an undirected graph is a tree or not. 

// An undirected graph is tree if it has following properties.

// There is no cycle.
// The graph is connected.
// Another way to understand this is to say that a tree is an undirected graph in which any two vertices are connected by exactly one path.

import java.util.*;
import java.io.*;

public class Source {

    private int vertexCount;
    private static LinkedList<Integer> adj[];

    Source(int vertexCount) {
        this.vertexCount = vertexCount;
        this.adj = new LinkedList[vertexCount];
        for (int i = 0; i < vertexCount; ++i) {
            adj[i] = new LinkedList<Integer>();    
        }
    }

    public void addEdge(int v, int w) {
        
        adj[v].add(w);
        adj[w].add(v);
    }

    // private boolean isValidIndex(int i) {
    //     // Write code here
    // }

    private boolean isCyclic(int v, boolean visited[], int parent) {
        visited[v] = true;
        Integer i;
        Iterator<Integer> it = adj[v].iterator();
        while(it.hasNext()){
            i = it.next();
            if(!visited[i]){
                if(isCyclic(i, visited, v))
                    return true;
            }
            else if(i != parent)
                return true;
        }
        return false;
    }

    public boolean isTree() {
      boolean visited[] = new boolean[vertexCount];
      for(int i = 0; i < vertexCount; i++)
        visited[i] = false;
      if(isCyclic(0, visited, -1))
        return false;
      for(int u = 0; u < vertexCount; u++)
        if(!visited[u])
            return false;
      return true;
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        // Get the number of nodes from the input.
        int noOfNodes =  sc.nextInt();
         // Get the number of edges from the input.
        int noOfEdges = sc.nextInt();

        Source graph = new Source(noOfNodes);
        // Adding edges to the graph
        for (int i = 0; i <noOfEdges; ++i) {
            graph.addEdge(sc.nextInt(),sc.nextInt());
        }
        if (graph.isTree()) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}