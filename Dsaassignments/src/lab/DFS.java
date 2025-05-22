package lab;

import java.util.*;
public class DFS {
	    private int vertices;
	    private LinkedList<Integer>[] adjList;

	    public DFS(int v) {
	        vertices = v;
	        adjList = new LinkedList[v];
	        for (int i = 0; i < v; i++) {
	            adjList[i] = new LinkedList<>();
	        }
	    }

	    public void addEdge(int src, int dest) {
	        adjList[src].add(dest);
	        // If undirected graph, also add reverse edge:
	        // adjList[dest].add(src);
	    }

	    public void dfs(int start) {
	        boolean[] visited = new boolean[vertices];
	        System.out.print("DFS Traversal: ");
	        dfsUtil(start, visited);
	        System.out.println();
	    }

	    private void dfsUtil(int node, boolean[] visited) {
	        visited[node] = true;
	        System.out.print(node + " ");

	        for (int neighbor : adjList[node]) {
	            if (!visited[neighbor]) {
	                dfsUtil(neighbor, visited);
	            }
	        }
	    }

	    public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);

	        System.out.print("Enter number of vertices: ");
	        int v = sc.nextInt();
	        DFS graph = new DFS(v);

	        System.out.print("Enter number of edges: ");
	        int e = sc.nextInt();

	        System.out.println("Enter edges (source destination):");
	        for (int i = 0; i < e; i++) {
	            int src = sc.nextInt();
	            int dest = sc.nextInt();
	            graph.addEdge(src, dest);
	        }

	        System.out.print("Enter starting node for DFS: ");
	        int start = sc.nextInt();

	        graph.dfs(start);
	        sc.close();
	    }
	}
