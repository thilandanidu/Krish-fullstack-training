package com.company.thilan;

public class Traversal {
    public static void main(String[] args) {

        try {
            Vertex tree = sample_tree();
            DFS.traversal1(tree);

        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    private static Vertex sample_tree() {
        Vertex root = new Vertex("A",
                new Vertex("B",
                        new Vertex("C"), new Vertex("D")),
                new Vertex("E",
                        new Vertex("F"), new Vertex("G",
                        new Vertex("H"),null)));
        return root;
    }
}
