package main.Ejercicio_04_depth;

import main.Materia.Models.Node;

public class Depth {

    public int maxDepth(Node root) {
        if (root == null) {
            return 0;

        }
        int depthLeft = maxDepth(root.getLeft());
        int depthRight = maxDepth(root.getLeft());
        return Math.max(depthLeft, depthRight) + 1;

    }

}
