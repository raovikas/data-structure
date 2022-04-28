package org.data.structure.practice.graph;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

public class GraphAdjacencyListNode {

	class Node {
		String name;
		List<String> ngbs;

		public Node(String name) {
			this.name = name;
			this.ngbs = new ArrayList<>();
		}
	}

	private Map<String, Node> map;

	public GraphAdjacencyListNode(List<String> cities) {
		map = new HashMap<String, GraphAdjacencyListNode.Node>();
		for (String city : cities) {
			map.put(city, new Node(city));
		}
	}

	public void addEdge(String src, String des, boolean undirectional) {
		map.get(src).ngbs.add(des);
		if (undirectional)
			map.get(des).ngbs.add(src);
	}
	
	public void printAdjList() {
		for(Entry<String, Node> entry : map.entrySet()) {
			System.out.print("City: "+entry.getKey()+" Connected with ");
			for(String ngb :entry.getValue().ngbs) {
				System.out.print(ngb+", ");
			}
			System.out.println();
		}
	}

	public static void main(String[] args) {
		List<String> cities = Arrays.asList("Delhi","Jaipur","Chandigarh");
		GraphAdjacencyListNode adjList = new GraphAdjacencyListNode(cities);
		adjList.addEdge("Delhi", "Jaipur", true);
		adjList.addEdge("Delhi", "Chandigarh", true);
		adjList.addEdge("Chandigarh", "Jaipur", true);
		
		adjList.printAdjList();
	}
}
