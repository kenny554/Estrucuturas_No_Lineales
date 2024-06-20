package Main.Materia.Controllers;

import java.util.Stack;

import Main.Materia.Models.Node;

public class ArbolBinario {

    // Recorrido del arbol preorder iterativo
    public void preOrderLoop(Node root) {
        if (root == null) {
            return;
        }

        Stack<Node> stack = new Stack<>();
        stack.push(root);

        while (!stack.isEmpty()) {
            Node node = stack.pop();
            System.out.print(node.getValue() + "-");

            // Agregamos los hijos de la derecha primero para procesar el izquierdo primero
            if (node.getRight() != null) {
                stack.push(node.getRight());
            }

            if (node.getLeft() != null) {
                stack.push(node.getLeft());
            }
        }
    }

    // Recorrido del arbol preorder recursivo
    public void preOrderRecursivo(Node node) {
        if (node != null) {
            System.out.print(node.getValue() + "-");
            preOrderRecursivo(node.getLeft());
            preOrderRecursivo(node.getRight());
        }
    }

    // Recorrido del arbol postorder iterativo
    public void postOrderLoop(Node root) {
        if (root == null) {
            return;
        }

        Stack<Node> stack = new Stack<>();
        Stack<Node> stack2 = new Stack<>();
        stack.push(root);

        while (!stack.isEmpty()) {
            Node node = stack.pop();
            stack2.push(node);

            if (node.getLeft() != null) {
                stack.push(node.getLeft());
            }

            if (node.getRight() != null) {
                stack.push(node.getRight());
            }
        }

        while (!stack2.isEmpty()) {
            Node node = stack2.pop();
            System.out.print(node.getValue() + "-");
        }
    }

    // Recorrido del arbol postorder recursivo
    public void postOrderRecursivo(Node node) {
        if (node != null) {
            postOrderRecursivo(node.getLeft());
            postOrderRecursivo(node.getRight());
            System.out.print(node.getValue() + "-");
        }
    }

    // Recorrido del arbol inorder recursivo
    public void inOrder(Node node) {
        if (node != null) {
            inOrder(node.getLeft());
            System.out.print(node.getValue() + "-");
            inOrder(node.getRight());
        }
    }

}