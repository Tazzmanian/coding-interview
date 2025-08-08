package org.graphs;

import lombok.Data;

import java.util.Map;
import java.util.Stack;
import java.util.concurrent.ConcurrentHashMap;

@Data
public class Graph {
    private final int MAX_VERTEX = 15;
    private Vertex arrayOfVertex[]; //cities
    private Map<String, Integer> mapOfVertex;
    //matrix of adjacent vertex:
    private int matrixOfAdjVertex[][];
    //register the location at the arrayOfVertex:
    private int numOfVertices;
    private Stack<Integer> stack;
    public Graph() {
        arrayOfVertex = new Vertex[MAX_VERTEX];
        mapOfVertex = new ConcurrentHashMap<>();
        numOfVertices = 0;
        matrixOfAdjVertex = new int[MAX_VERTEX][MAX_VERTEX];
        stack = new Stack<>();
//initialize matrix
        for (int i = 0; i < MAX_VERTEX; i++) {
            for (int j = 0; j < MAX_VERTEX; j++) {
                matrixOfAdjVertex[i][j] = 0;
            }
        }
    }

    public void addVertex(Vertex city) {
        mapOfVertex.put(city.getName(), numOfVertices);
        arrayOfVertex[numOfVertices++] = city;
    }

    public void addEdge(String city1, String city2) {
        int start = mapOfVertex.get(city1);
        int end = mapOfVertex.get(city2);
        matrixOfAdjVertex[start][end] = 1;
        matrixOfAdjVertex[end][start] = 1;
    }

    public void dfs(String city) {
        int vertex = mapOfVertex.get(city);
        arrayOfVertex[vertex].setVisited(true);
        System.out.print(city + " ");
        stack.push(vertex);
        while (!stack.isEmpty()) {
            int adjVertex = getAdjVertex(stack.peek());
            if (adjVertex != -1) {
                arrayOfVertex[adjVertex].setVisited(true);
                System.out.print(
                        arrayOfVertex[adjVertex].getName() + " ");
                stack.push(adjVertex);
            } else {
                stack.pop();
            }
        }
    }

    private int getAdjVertex(int vertex) {
        for (int adj = 0; adj < numOfVertices; adj++) {
            if (matrixOfAdjVertex[vertex][adj] == 1 &&
                    arrayOfVertex[adj].isVisited() == false)
                return adj; //return first adjacent vertex
        }
        return -1; //not vertices found
    }
}
