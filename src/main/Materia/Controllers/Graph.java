package main.Materia.Controllers;

import java.util.ArrayList;
import java.util.List;

import main.Materia.Models.NodeGraph;

public class Graph {

    private List<NodeGraph> nodes;

    public Graph() {
        this.nodes = new ArrayList<>();
    }

    // Metodo anadir un nodo
    public NodeGraph addNode(int value) {
        NodeGraph newNode = new NodeGraph(value);
        nodes.add(newNode);
        return newNode;

    }

    // Metodo anadir arista
    public void addEdge(NodeGraph src, NodeGraph dest) {
        src.addNeighbor(dest);
        dest.addNeighbor(src);

    }

    // Metodo imprimir Grafo
    public void printGraph() {
        for (NodeGraph node : nodes) {
            System.out.print("Vertex " + node.getValue() + ":");

            for (NodeGraph neighbor : node.getNeihghborts()) {
                System.out.print("-> " + neighbor.getValue());
            }
            System.out.println();
        }
    }

    public void getDPS(NodeGraph starNode) {

    }

    public void getDPSUtil(NodeGraph node, boolean[] visited) {

    }

    public void getBFS(NodeGraph staNode) {
    }

    public int[][] getAdjacencyMatrix() {
        return getAdjacencyMatrix();

    }

    public void printAdjacencyMatrix() {

    }

}
