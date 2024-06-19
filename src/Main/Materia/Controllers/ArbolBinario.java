package Main.Materia.Controllers;

import java.util.Stack;

import Main.Materia.Models.Node;

public class ArbolBinario {
    // Recorrido del arbol preorder
    public void preOrderLoop(Node root) {
        if (root == null) {
            return;

        }
        Stack<Node> stack = new Stack<>();
        // Agregamos a la pila la raiz para empezar a validar
        stack.push(root);

        while (!stack.isEmpty()) {
            Node node = stack.pop();
            System.out.print(node.getValue() + "-");
            // Agregamos los hijos de la derecha a la pila
            if (node.getRight() != null) {
                stack.push(node.getRight());

            }
            // Agregamos hijos izquierda a la pila
            if (node.getLeft() != null) {
                stack.push(node.getLeft());

            }

        }

    }

    public void preOrderRecursivo(Node node) {
        if (node != null) {
            System.out.print(node.getValue() + "-");
            preOrderLoop(node.getLeft());
            preOrderLoop(node.getRight());

        }
    }

    public void postOrderLoop(Node root) {
        if (root != null) {

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

    public void preOrder(Node node) {
        if (node != null) {
            preOrderLoop(node.getLeft());
            preOrderLoop(node.getRight());
            System.out.print(node.getValue() + "-");

        }
    }

    public void inOrder(Node node) {
        if (node != null) {
            preOrderLoop(node.getLeft());
            System.out.print(node.getValue() + "-");
            preOrderLoop(node.getRight());

        }

    }

}
