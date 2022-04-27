package org.data.structure.practice.graph;

import java.util.LinkedList;

public class GraphAdjacencyList {

	private int V;
	private int E;
	private LinkedList<Integer> adj[];
	
	public GraphAdjacencyList(int nodes) {
		this.V = nodes;
		this.E = 0;
		adj = new LinkedList[V];
		for (int i = 0; i < V; i++) {
			adj[i] = new LinkedList<>();
		}
		
	}
	
	public void addEdge(int u , int v) {
		adj[u].add(v);
		adj[v].add(u);
		E++;
	}
	
	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("Edges: "+E+", and Vertices:"+ V + "\n");
		for(int i=0;i<V;i++) {
			sb.append(i+":");
			for(Integer node : adj[i]){
				sb.append(node+" ");
			}
			sb.append("\n");

		}
		return sb.toString();
	}
	
	public static void main(String[] args) {
		GraphAdjacencyList adjList = new GraphAdjacencyList(5);
		adjList.addEdge(0, 2);
		adjList.addEdge(0, 1);
		adjList.addEdge(1, 3);
		adjList.addEdge(3, 2);
		adjList.addEdge(3, 4);
		adjList.addEdge(2, 4);
		
		System.out.println(adjList);
	}
}
