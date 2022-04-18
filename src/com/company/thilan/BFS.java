package com.company.thilan;

import java.util.LinkedList;
import java.util.Queue;
public class BFS {

    static void traversal(Vertex Vertex) {
        Queue<Vertex> q = new LinkedList<Vertex>();

        q.add(Vertex);

        while(!q.isEmpty()) {
            Vertex = q.remove();

            System.out.println(Vertex.data + " ");

            if (Vertex.left != null)
                q.add(Vertex.left);

            if (Vertex.right != null)
                q.add(Vertex.right);
        }
    }

}
