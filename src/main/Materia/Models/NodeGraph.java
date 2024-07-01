package main.Materia.Models;

import java.util.LinkedList;
import java.util.List;

public class NodeGraph {
    private int value;
    private List<NodeGraph> neighbor;

    public NodeGraph(int value) {
        this.value = value;
        this.neighbor = new LinkedList<>();
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public List<NodeGraph> getNeihghborts() {
        return neighbor;
    }

    public void setNeihghborts(List<NodeGraph> Neighbor) {
        this.neighbor = Neighbor;
    }

    public void addNeighbor(NodeGraph neighbor) {
        this.neighbor.add(neighbor);
    }

}