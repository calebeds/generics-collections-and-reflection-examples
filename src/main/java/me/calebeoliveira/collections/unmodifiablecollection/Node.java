package me.calebeoliveira.collections.unmodifiablecollection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Node {
    private List<Node> neighbors;

    public Node(List<Node> neighbors) {
        this.neighbors = new ArrayList<>();
    }

    public List<Node> getNeighbors() {
        return Collections.unmodifiableList(neighbors);
    }
}
