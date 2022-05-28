package com.company;
import java.util.LinkedList;
public class AdjacencyList {
    int V;
    LinkedList<Integer> adjListArray[];
    // constructor
    AdjacencyList(int V) {
        this.V = V;
        // define the size of array as
        // number of vertices
        adjListArray = new LinkedList[V];
        // Create a new list for each vertex
        // such that adjacent nodes can be stored
        for (int i = 0; i < V; i++) {
            adjListArray[i] = new LinkedList<>();
        }
    }
    // Adds an edge to an undirected graph
    public void addEdge(char src, char dest) {
        // Add an edge from src to dest.
        int indexSrc = (int) src - 65;
        int indexDest = (int) dest - 65;
        adjListArray[indexSrc].add(indexDest);

    }
    // A utility function to print the adjacency list
    // representation of graph
    public void printGraph() {
        for (int i = 0; i < V; i++) {
            if (adjListArray[i].size() > 0) {
                int abjad1 = i + 65;
                System.out.print("Vertex " + (char)abjad1 + " is connected to: ");
                for (int j = 0; j < adjListArray[i].size(); j++) {
                    int abjad2 = adjListArray[i].get(j) + 65;
                    System.out.print((char)abjad2+ " ");
                }
                System.out.println();
            }
        }
    }
}

