package main.Ejercicio_02_invert;

import main.Materia.Models.Node;

public class InvertBinaryTree {
    public Node invertTree(Node root) {
        if (root != null) {
            Node tempNode = root.getLeft();

            root.setLeft(invertTree(root.getRight()));
            root.setRight(invertTree(tempNode));
        }

        return root;
    }
}
