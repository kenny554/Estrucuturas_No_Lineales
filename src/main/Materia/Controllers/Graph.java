package main.Materia.Controllers;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

import main.Materia.Models.NodeGraph;

public class Graph {

    private List<NodeGraph> nodes;

    public Graph() {
        this.nodes = new ArrayList<>();
    }

    // Método para añadir un nodo
    public NodeGraph addNode(int value) {
        NodeGraph newNode = new NodeGraph(value);
        nodes.add(newNode);
        return newNode;
    }

    // Método para añadir una arista
    public void addEdge(NodeGraph src, NodeGraph dest) {
        src.addNeighbor(dest);
        dest.addNeighbor(src);
    }

    // Método para imprimir el grafo
    public void printGraph() {
        for (NodeGraph node : nodes) {
            System.out.print("Vertex " + node.getValue() + ":");

            for (NodeGraph neighbor : node.getNeihghborts()) {
                System.out.print(" -> " + neighbor.getValue());
            }
            System.out.println();
        }
    }

    // Método para recorrido en profundidad (DFS)
    public void getDFS(NodeGraph startNode) {
        boolean[] visited = new boolean[nodes.size()];
        getDFSUtil(startNode, visited);
    }

    private void getDFSUtil(NodeGraph node, boolean[] visited) {
        visited[node.getValue()] = true;
        System.out.print(node.getValue() + " ");

        for (NodeGraph neighbor : node.getNeihghborts()) {
            if (!visited[neighbor.getValue()]) {
                getDFSUtil(neighbor, visited);
            }
        }
    }

    // Método para recorrido en amplitud (BFS)
    // Método para recorrido en amplitud (BFS)
    public void getBFS(NodeGraph startNode) {
        boolean[] visited = new boolean[nodes.size()];
        Queue<NodeGraph> queue = new LinkedList<>();

        visited[startNode.getValue()] = true;
        queue.add(startNode);

        while (!queue.isEmpty()) {
            NodeGraph current = queue.poll();
            System.out.print(current.getValue() + " ");
            for (NodeGraph neighbor : current.getNeihghborts()) {
                if (!visited[neighbor.getValue()]) {
                    visited[neighbor.getValue()] = true;
                    queue.add(neighbor);
                }
            }
        }
    }

    public int[][] getAdjacencyMatrix() {
        return getAdjacencyMatrix();

    }

    public void printAdjacencyMatrix() {

    }

}
