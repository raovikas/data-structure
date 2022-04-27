package org.data.structure.practice.graph;

public class GraphAdjacencyMatrix {

	int vertix;
	int[][] matrix;

	public GraphAdjacencyMatrix(int vertix) {
		this.vertix = vertix;
		this.matrix = new int[vertix][vertix];
	}

	public void addEdge(int source, int destination) {
		// add edge
		matrix[source][destination] = 1;
		// bidirection edge
		matrix[destination][source] = 1;
	}

	public void printGraph() {
		for (int i = 0; i < vertix; i++) {
			for (int j = 0; j < vertix; j++) {
				System.out.print(matrix[i][j] + " ");
			}
			System.out.println();
		}

		for (int i = 0; i < vertix; i++) {
			for (int j = 0; j < vertix; j++) {
				if (matrix[i][j] == 1) {
					System.out.println("vertix " + i + " is connected with vertix " + j);
				}
			}
		}
	}

	public static void main(String[] args) {
		GraphAdjacencyMatrix adjMatrix = new GraphAdjacencyMatrix(5);
		adjMatrix.addEdge(0, 1);
		adjMatrix.addEdge(0, 2);
		adjMatrix.addEdge(1, 3);
		adjMatrix.addEdge(3, 2);
		adjMatrix.addEdge(3, 4);
		adjMatrix.addEdge(2, 4);

		adjMatrix.printGraph();
	}
}
