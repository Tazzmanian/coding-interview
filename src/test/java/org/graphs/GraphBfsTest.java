package org.graphs;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class GraphBfsTest {
    GraphBfs graph;

    @BeforeEach
    public void setup() {
        graph = new GraphBfs(15);
    }

    @Test
    public void test_addVertex() {
        Vertex city = new Vertex("Berlin");
        graph.addVertex(city);
        assertEquals(1, graph.getMapOfVertex().size());
    }

    @Test
    public void test_addEdge() {
        String city1 = "Berlin";
        String city2 = "Leipzig";
        Vertex v1 = new Vertex(city1);
        Vertex v2 = new Vertex(city2);
        graph.addVertex(v1); //location 0
        graph.addVertex(v2); //location 1
        graph.addEdge(city1, city2);
        assertEquals(1, (int) graph.getAdjList()[0].getFirst());
        assertEquals(0, (int) graph.getAdjList()[1].getFirst());
    }

    @Test
    public void test_bfs() {
        String city1 = "Berlin";
        String city2 = "Leipzig";
        String city3 = "Dresden";
        String city4 = "Nürnberg";
        String city5 = "Hannover";
        String city6 = "Rostock";
        String city7 = "Dortmund";
        String city8 = "Frankfurt";
        String city9 = "Stuttgart";
        String city10 = "München";
        String city11 = "Magdeburg";
        String city12 = "Bremen";
        graph.addVertex(new Vertex(city1));
        graph.addVertex(new Vertex(city2));
        graph.addVertex(new Vertex(city3));
        graph.addVertex(new Vertex(city4));
        graph.addVertex(new Vertex(city5));
        graph.addVertex(new Vertex(city6));
        graph.addVertex(new Vertex(city7));
        graph.addVertex(new Vertex(city8));
        graph.addVertex(new Vertex(city9));
        graph.addVertex(new Vertex(city10));
        graph.addVertex(new Vertex(city11));
        graph.addVertex(new Vertex(city12));
        graph.addEdge(city1, city2);
        graph.addEdge(city2, city3);
        graph.addEdge(city3, city4);
        graph.addEdge(city4, city10);
        graph.addEdge(city11, city5);
        graph.addEdge(city5, city7);
        graph.addEdge(city7, city8);
        graph.addEdge(city8, city9);
        graph.addEdge(city1, city6);
        graph.addEdge(city1, city11);
        graph.addEdge(city5, city12);
        graph.addEdge(city9, city10);
        graph.bfs(city1);
    }
}