package main.Ejercicio_02_invert;

import main.Materia.Models.Node;

public class InvertBinaryTree {
    public Node invertTree(Node root) {
        if (root != null) {
            Node temNode = root.getLeft();

            invertTree(root.getRight());
            invertTree(root.getLeft());
        }

        return root;
    }
}
