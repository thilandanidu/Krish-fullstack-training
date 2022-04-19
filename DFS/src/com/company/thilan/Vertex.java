package com.company.thilan;

public class Vertex {
    Vertex left;
    Vertex right;
    String data;

    public Vertex(String data) {
        this.data = data;

    }

    public Vertex(String data, Vertex left, Vertex right) {
        this.data = data;
        this.left = left;
        this.right = right;
    }
}
