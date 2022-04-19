package com.company.thilan;

public class DFS {
    static void traversal1(Vertex Vertex) {
        if (Vertex == null)
            return;
        System.out.println(Vertex.data);
        traversal1(Vertex.left);
        traversal1(Vertex.right);
    }
}
