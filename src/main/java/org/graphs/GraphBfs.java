package org.graphs;

import lombok.Data;

import java.util.LinkedList;
import java.util.Map;
import java.util.Queue;
import java.util.concurrent.ConcurrentHashMap;

@Data
public class GraphBfs {
    private final int MAX_VERTEX;
    private Vertex arrayOfVertex[]; //cities
    private Map<String, Integer> mapOfVertex;
    //Adjacency list:
    private LinkedList<Integer>[] adjList;
    //register the location at the arrayOfVertex:
    private int numOfVertices;
    private Queue<Integer> queue;

    public GraphBfs(int vertices) {
        MAX_VERTEX = vertices;
        arrayOfVertex = new Vertex[MAX_VERTEX];
        mapOfVertex = new ConcurrentHashMap<>();
        numOfVertices = 0;
        queue = new LinkedList<>();

        adjList = new LinkedList[MAX_VERTEX];
        for (int i = 0; i < MAX_VERTEX; i++) {
            adjList[i] = new LinkedList<Integer>();
        }
    }

    public void addVertex(Vertex city) {
        mapOfVertex.put(city.getName(), numOfVertices);
        arrayOfVertex[numOfVertices++] = city;
    }

    public void addEdge(String city1, String city2) {
        int start = mapOfVertex.get(city1);
        int end = mapOfVertex.get(city2);
        adjList[start].add(end);
        adjList[end].add(start);
    }

    public void bfs(String city) {
        int vertex = mapOfVertex.get(city);
        arrayOfVertex[vertex].setVisited(true);
        System.out.print(city + " ");
        queue.add(vertex);

        //iterate until queue empty
        while (!queue.isEmpty()) {
            int headVertex = queue.remove();
            int adjVertex;
            //iterate until it has no unvisited cities
            while ((adjVertex = getAdjVertex(headVertex)) != -1) {
                arrayOfVertex[adjVertex].setVisited(true);
                System.out.print(arrayOfVertex[adjVertex].getName() + " ");
                queue.add(adjVertex);
            }
        }
    }

    private int getAdjVertex(int vertex) {
        LinkedList linkedList = adjList[vertex];
        for (Object o : linkedList) {
            if (!arrayOfVertex[(int) o].isVisited())
                return (int) o; //return first adjacent vertex
        }
        return -1; //not vertices found
    }
}
