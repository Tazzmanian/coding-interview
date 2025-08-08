package org.graphs;

import lombok.Data;

@Data
public class Vertex {

    private String name;
    private boolean visited;

    public Vertex(String name) {
        this.name = name;
        visited = false;
    }
}
