package main;
/*
 *          1
 *     2        3
 *  4     5        6
 * 7    8
 */

import main.Materia.Controllers.Graph;
import main.Materia.Models.NodeGraph;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Estructuras de Datos No Lineales");
        // ArbolBinario arbolBinario = new ArbolBinario();
        // Node nodeRoot = new Node(1);
        // nodeRoot.setLeft(new Node(2));
        // nodeRoot.setRight(new Node(3));

        // nodeRoot.getLeft().setLeft(new Node(4));
        // nodeRoot.getLeft().setRight(new Node(5));

        // nodeRoot.getRight().setRight(new Node(6));
        // nodeRoot.getLeft().getLeft().setLeft(new Node(7));
        // nodeRoot.getLeft().getRight().setLeft(new Node(8));

        // System.out.println("METODO-PRE-ORDER-LOOP");
        // arbolBinario.preOrderLoop(nodeRoot);
        // System.out.println("\nMETODO-PRE-ORDER-RECURSIVO");
        // arbolBinario.preOrderRecursivo(nodeRoot);
        // System.out.println("\nMETODO-POST-ORDER-LOOP");
        // arbolBinario.postOrderLoop(nodeRoot);
        // System.out.println("\nMETODO-POST-ORDER-RECURSIVO");
        // arbolBinario.postOrderRecursivo(nodeRoot);
        // System.out.println("\nIN ORDER");
        // arbolBinario.inOrder(nodeRoot);

        // AVLTree tree = new AVLTree();
        // int[] values = { 10, 20, 15, 24, 9, 8, 21, 23, 50, 25 };
        // for (int value : values) {
        // tree.insert(value);
        // }

        runGraph();
    }

    private static void runGraph() {
        Graph grafo = new Graph();
        // agregar nodos
        // NodeGraph node1 = new NodeGraph(1);
        // NodeGraph node2 = new NodeGraph(2);
        // NodeGraph node3 = new NodeGraph(3);
        // NodeGraph node4 = new NodeGraph(4);
        // NodeGraph node5 = new NodeGraph(5);

        NodeGraph node1 = grafo.addNode(1);
        NodeGraph node2 = grafo.addNode(2);
        NodeGraph node3 = grafo.addNode(3);
        NodeGraph node4 = grafo.addNode(4);
        NodeGraph node5 = grafo.addNode(5);
        grafo.addEdge(node1, node2);
        grafo.addEdge(node2, node4);
        grafo.addEdge(node1, node3);
        grafo.addEdge(node4, node5);

        // Imprime Grafo
        grafo.printGraph();

    }
}
